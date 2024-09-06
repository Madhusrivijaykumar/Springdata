package com.example.demo.Repository;

import com.example.demo.Entity.Employee;

import java.util.List;
import java.util.Optional;


public interface EmployeeRepository extends MongoRepository<Employee, String> {
    Employee save(Employee employee);

    Optional<Employee> findById(String id);

    List<Employee> findAll();
}
