package com.vinothan.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinothan.demo.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
