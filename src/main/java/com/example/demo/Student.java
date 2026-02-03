package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	Leptop leptop;
	
	void study() {
		System.out.println("Student is Studing");
	}
	
	void displayLeptop() {
		leptop.work();
	}

	@Autowired
	public void setLeptop(Leptop leptop) {
		this.leptop = leptop;
	}
	 
}
