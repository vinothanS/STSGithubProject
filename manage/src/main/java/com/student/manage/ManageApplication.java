package com.student.manage;

import com.student.manage.entity.Student;
import com.student.manage.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManageApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ManageApplication.class, args);
	}

	@Autowired

	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		/*
		Student student1=new Student
				("Ramesh","Fadatare","ramesh@gmail.com");
		studentRepository.save(student1);

		Student student2=new Student("Vinoth","Kumar","vino12@gmail.com");
		studentRepository.save(student2);

		 */
	}
}
