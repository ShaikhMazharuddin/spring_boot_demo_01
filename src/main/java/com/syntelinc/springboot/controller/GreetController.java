/**
 * 
 */
package com.syntelinc.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.syntelinc.springboot.model.Student;

/**
 * @author mazhar
 *
 */
@RestController
public class GreetController {

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String greet() {
		return "Hello World";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/studentDetails")
	public Student showStudent() {
		return new Student(1, "mazhar", "A");
	}

	@RequestMapping(method = RequestMethod.GET, value = "/studentList")
	public List<Student> getStudentList() {
		List<Student> studentList = new ArrayList<Student>();
		Student studentOne = new Student(1, "Mazhar", "A");
		Student studentTwo = new Student(2, "Shaikh", "B");
		studentList.add(studentOne);
		studentList.add(studentTwo);
		return studentList;
	}
}