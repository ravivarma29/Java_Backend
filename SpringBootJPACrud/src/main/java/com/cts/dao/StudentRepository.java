package com.cts.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cts.model.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	
	@Query("Select s from Student s where s.studentId=:id")
	public Student getStudentById(@Param("id") int id);
	
	@Query(value = "select * from Students  where s.marks=?1",nativeQuery = true)
	public List<Student> getStudentByMarks(int marks);
	
	public Student findByName(String name);
	
	public Student findByNameStartingWith(String name);
	
}
