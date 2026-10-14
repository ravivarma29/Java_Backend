package com.cts.service;

//import com.cts.controller.StudentController;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.cts.dao.StudentRepository;
import com.cts.model.Student;




@Service
public class StudentService {

//	private final StudentController studentController;
	@Autowired
	StudentRepository studentRepository;

//	StudentService(StudentController studentController) {
//		this.studentController = studentController;
//	}
	
	public String saveStd() {
		
		Student st = new Student("Ravi",75);

		Student student = studentRepository.save(st);
		return student.getName();
	}
	
	public Student getstudentById(int id) {
		Optional<Student> studentOptional = studentRepository.findById(1);
		Student student = studentOptional.get();
		return student;
		
	}

	public List<Student> getAllStudents()
	{
		List<Student> list = studentRepository.findAll();
		return list;
	}
	
	public String delete(int id)
	{
		Student student = studentRepository.findById(id).get();
		studentRepository.delete(student);
		return student.getName();	
	}
	
	public Student getStudentBasedonId(int id) {
		Student student = studentRepository.getStudentById(id);
		return student;
	}
	
	public List<Student> getStudentBasedonMarks (int marks)
	{
		
		List<Student> studentMarks = studentRepository.getStudentByMarks(marks);
		return studentMarks;
	}
	
	public Student findByName(String name)
	{
		Student stName = studentRepository.findByName(name);
		return stName;
	}
	
	public Student findByNameStartingWith(String name)
	{
		Student stName = studentRepository.findByNameStartingWith(name);
		return stName;
	}
	
	
	public Page<Student> findByPage(int page, int size) {

	    PageRequest pageRequest = PageRequest.of(page, size);
	    Page<Student> allStudents = studentRepository.findAll(pageRequest);
	    return allStudents;
	}
}
 