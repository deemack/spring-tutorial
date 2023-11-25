package com.example.spring.repository;

import com.example.spring.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

// Extending the JPARepository interface enables our EmployeeRepository to get CRUD methods for our Employee JPA model/entity
// JpaRepository requires 2 parameters, type of the entity, and type of primary key
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
