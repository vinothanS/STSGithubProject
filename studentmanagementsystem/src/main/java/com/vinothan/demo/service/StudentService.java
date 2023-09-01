package com.vinothan.demo.service;

import java.util.List;

import com.vinothan.demo.entity.Student;
public interface StudentService {
	
	List<Student> getAllStudents();
 Student saveStudent(Student student);
 Student getStudentById(Long id);
 Student updatStudent(Student student);
 void deleteStudentById(Long id);
}
