package com.spring.boot.first.firstwebapplication.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.boot.first.firstwebapplication.entity.repo.TodoEntityRepo;
import com.spring.boot.first.firstwebapplication.model.Todo;
import com.spring.boot.first.firstwebapplication.service.TodoService;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	
	@Autowired
	TodoService todoService;
	
	@Autowired
	TodoEntityRepo todoRepo;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, false));
	
	}
	
	@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
	public String showTodos(ModelMap model) {
		
		String nam = getLoggedInUserName();
		model.put("todos",todoRepo.findByUser(getLoggedInUserName()));
		
		return "list-todos";
		
	}

	private String getLoggedinUserName(ModelMap model) {
		return (String) model.get("name");
	}
	
	@RequestMapping(value ="/add-todo", method = RequestMethod.GET)
	public String showTodo(ModelMap model) {
		model.addAttribute("todo",new Todo(0, getLoggedinUserName(model), "", new Date(), false));
		return "todo";
	}
	
	@RequestMapping(value = "/add-todo", method = RequestMethod.POST)
	public String addTodos(ModelMap model, @Valid Todo todo, BindingResult result) {
		
		if(result.hasErrors()) {
			return "todo";
		}
		
		todo.setUser(getLoggedInUserName());
		todoRepo.save(todo);
		
		
		//todoService.addTodo(getLoggedinUserName(model),todo.getDesc(), todo.getTargetCompletion(), false);
		
		return "redirect:/list-todos";
		
	}
	@RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
	public String deleteTodo(@RequestParam int id) {
		
		todoRepo.deleteById(id);
		
		return "redirect:/list-todos";
		
	}
	@RequestMapping(value = "/update-todo", method = RequestMethod.GET)
	public String showUpdateTodo(@RequestParam int id, ModelMap model ){
		
		Optional<Todo> todo = todoRepo.findById(id);
		model.put("todo",todo);
		
		return "todo";
		
	}
	@RequestMapping(value = "/update-todo", method = RequestMethod.POST)
	public String updateTodo(@Valid Todo todo, ModelMap model, BindingResult result){
		
		if(result.hasErrors()) {
			return "todo";
		}
		todo.setUser(getLoggedinUserName(model));
		todoRepo.save(todo);
		return "redirect:/list-todos";
		
	}
	private String getLoggedInUserName() {
		
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if(principal instanceof UserDetails) {
			
			return ((UserDetails)principal).getUsername();
		}
		return principal.toString() ;
		
	}
	
	
}
