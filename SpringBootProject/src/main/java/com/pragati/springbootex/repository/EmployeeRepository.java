package com.pragati.springbootex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pragati.springbootex.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}