package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	
	Leptop leptop;
	
	void display() {
		System.out.println("Student is studing");
	}
	
	
	void leptopDisplay() {
		leptop.work();
	}
	
	@Autowired
	public Student(Leptop leptop) {
		this.leptop = leptop;
	}
	
	
	
	
} 
