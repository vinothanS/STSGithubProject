package com.vinothan.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinothan.demo.entity.Student;


public interface StudentRepository extends JpaRepository<Student,Long> {

}
