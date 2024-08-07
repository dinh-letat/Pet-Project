package com.ReactSpring.CRM_Project_be.repository;

import com.ReactSpring.CRM_Project_be.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
