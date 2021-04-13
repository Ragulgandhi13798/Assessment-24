package com.example;

import java.util.HashSet;
import java.util.List;

class Employee {

	int id;
	String name;
	int age;
	
	
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
 }
	public class Example {
		
	
	public static void main(String[] args) {
		
      HashSet<Employee> h = new HashSet<Employee>();
      h.add(new Employee (11,"sam",25));
      h.add(new Employee (12,"surya",35));
      h.add(new Employee (13,"sam",54));
      h.add(new Employee (11,"vikram",46));
      
      Employee e = h.stream().max((a,b)->a.age>b.age ?1:-1).get();
    		  System.out.println(e.age);
    		  
      Employee e1 = h.stream().min((a,b)->a.age>b.age ?1:-1).get();
    		  System.out.println(e1.age);
    		  
	}

}
