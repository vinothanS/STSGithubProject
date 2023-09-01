package com.vinothan.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vinothan.demo.entity.Student;
import com.vinothan.demo.repository.StudentRepository;
import com.vinothan.demo.service.StudentService;


@Service

public class StudentServiceImpl  implements StudentService{
	
	
	private StudentRepository studentRepository;
	

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}


	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}


	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}


	@Override
	public Student updatStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}


	@Override
	public void deleteStudentById(Long id) {
		 studentRepository.deleteById(id);
		
	}

}
