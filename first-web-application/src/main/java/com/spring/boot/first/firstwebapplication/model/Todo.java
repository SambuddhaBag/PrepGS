package com.spring.boot.first.firstwebapplication.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Todo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String user;
	
	@Size(min = 10, message = "Enter atleast 10 characters")
	private String descrp;
	private Date targetCompletion;
	private boolean done;
	
	public Todo(){
	}
	
	public Todo(int id, String user, String descrp, Date targetCompletion, boolean done) {
		super();
		this.id = id;
		this.user = user;
		this.descrp = descrp;
		this.targetCompletion = targetCompletion;
		this.done = done;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getDesc() {
		return descrp;
	}

	public void setDesc(String desc) {
		this.descrp = desc;
	}

	public Date getTargetCompletion() {
		return targetCompletion;
	}

	public void setTargetCompletion(Date targetCompletion) {
		this.targetCompletion = targetCompletion;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean isDone) {
		this.done = isDone;
	}

	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Todo other = (Todo) obj;
        if (id != other.id) {
            return false;
        }
        return true;
    }

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		        return String.format(
		                "Todo [id=%s, user=%s, desc=%s, targetCompletion=%s, isDone=%s]", id,
		                user, descrp, targetCompletion, done);
		    }

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	

}
