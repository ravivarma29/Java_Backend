package com.cts.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Student;
import com.cts.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/save")
	public String saveStudent() {
		String name =studentService.saveStd();
		return name;
	}

	@GetMapping("/studentById")
	public Student getstudentById() {
		return studentService.getstudentById(1);
		
	}
	
	@GetMapping("/allStudents")
	public List<Student> allStudents()
	{
		return studentService.getAllStudents();
	}
	
	
	@GetMapping("/delete")
	public String deleteStudent()
	{
		return studentService.delete(1); 
	}
	
	@GetMapping("/byId")
	public Student getStudentbasedonId(@RequestParam(name="id") int id) {
		return studentService.getStudentBasedonId(id);
	}
	
	@GetMapping("/byMarks")
	public  List<Student> getStudentbasedonmarks(@RequestParam(name="marks") int marks) {
		return studentService.getStudentBasedonMarks(marks);
	}
	
	@GetMapping("/findbyName")
	public  Student findbyName(@RequestParam(name="name") String name) {
		return studentService.findByName(name);
		
	}
	
	
	@GetMapping("/findbyNameStartingWith")
	public  Student findbyNameStartingWith(@RequestParam(name="name") String name) {
		return studentService.findByName(name);
		
	}
	
	@GetMapping("/byPage")
	public Page<Student> findByPage(@RequestParam(name = "page") int page,@RequestParam(name = "size") int size) {

	    return studentService.findByPage(page, size);
	} 
	
}
