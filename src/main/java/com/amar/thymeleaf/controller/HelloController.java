package com.amar.thymeleaf.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.amar.thymeleaf.modal.Student;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}

	@RequestMapping("/sendData")
	public ModelAndView sendDate() {
		ModelAndView modelAndView = new ModelAndView("data");
		modelAndView.addObject("message", "Take up one idea and make it your life");
		return modelAndView;
	}

	@RequestMapping("/student")
	public ModelAndView student() {
		ModelAndView modelAndView = new ModelAndView("student");
		Student student = new Student();
		student.setName("amar");
		student.setScore(500);
		modelAndView.addObject("student", student);
		return modelAndView;
	}

	@RequestMapping("/students")
	public ModelAndView students() {
		ModelAndView modelAndView = new ModelAndView("studentList");
		Student student = new Student();
		student.setName("amar");
		student.setScore(500);
		Student student1 = new Student();
		student1.setName("bunty");
		student1.setScore(300);
		
	    List<Student> students =	Arrays.asList(student, student1);
	    //  System.out.println(Arrays);	
		modelAndView.addObject("students", students);
		return modelAndView;
	}

	@RequestMapping("/studentsfrom")
	public ModelAndView studentsFrom() {
		ModelAndView modelAndView = new ModelAndView("studentFrom");
		Student student = new Student();
		student.setName("amar");
		student.setScore(500);
		modelAndView.addObject("student", student);
		return modelAndView;
	}
	
}
