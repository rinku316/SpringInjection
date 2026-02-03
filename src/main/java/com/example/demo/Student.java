package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
<<<<<<< HEAD
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
=======
	
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
>>>>>>> 290c53d4da7e8e54e5e3a70e8a0a484c62aabf27
