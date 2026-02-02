package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SecondprojectApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SecondprojectApplication.class, args);
		
		Student student = ac.getBean(Student.class);
		
		student.display();
		student.leptopDisplay();
	}

}
