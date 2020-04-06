package com.app.springbootrestapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.springbootrestapi.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> {

}
