package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.StudentRepository;
import com.cts.model.Student;




@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public String saveStd() {
		
		Student st = new Student("Ravi",75);

		Student student = studentRepository.save(st);
		return student.getName();
	}
	
}
 