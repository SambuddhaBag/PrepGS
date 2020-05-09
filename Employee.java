package com.dsprep.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Emp> empList = new ArrayList<Emp>();
		empList.add(new Emp(1, "name1", "dept1", 100));
		empList.add(new Emp(1, "name2", "dept2", 200));
		empList.add(new Emp(1, "name3", "dept1", 102));
		empList.add(new Emp(1, "name4", "dept2", 150));
		empList.add(new Emp(1, "name5", "dept1", 150));
		
		List<Integer> numbers = Arrays.asList(2,3,4,5,2);
		
		
		
		Map<String, Emp> empMap = empList.stream()
	            .collect(Collectors.toMap(
	                    e -> e.dept,
	                    e -> e,
	                    BinaryOperator.maxBy(Comparator.comparingInt(e -> e.salary)) 
	                ));
		
		for (Map.Entry<String, Emp> ep: empMap.entrySet()) {
			
			System.out.println(ep);
			
		}
		

	}

}
