package com.example.StudentManagement;

import com.example.StudentManagement.model.Student;
import com.example.StudentManagement.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StudentManagementApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StudentManagementApplication.class, args);

		StudentService studentService = context.getBean(StudentService.class);

//
//		Student s1 = new Student();
//		s1.setRollno(102);
//		s1.setSname("Ronaldo");
//		s1.setMobileno(455751548L);
//		s1.setBloodgrp("A+");
//
//		studentService.saveStudent(s1);
	}

}
