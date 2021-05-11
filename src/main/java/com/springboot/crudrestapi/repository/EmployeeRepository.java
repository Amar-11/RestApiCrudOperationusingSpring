package com.springboot.crudrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.crudrestapi.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository< Employee, Long>
{

}
