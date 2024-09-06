package com.example.demo.Controller;
import com.example.demo.Entity.Employee;
import com.example.demo.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class Controller {
   

    @RestController
    @RequestMapping("/api/employees")
    public class EmployeeController {

        @Autowired
        private EmployeeRepository employeeRepository;

        // 1. Add Employee
        @PostMapping("/add")
        public Employee addEmployee(@RequestBody Employee employee) {
            return employeeRepository.save(employee);
        }

        // 2. Display All Employees
        @GetMapping("/displayAll")
        public List<Employee> getAllEmployees() {
            return employeeRepository.findAll();
        }

        // 3. Display Employee by ID
        @GetMapping("/display/{id}")
        public Optional<Employee> getEmployeeById(@PathVariable String id) {
            return employeeRepository.findById(id);
        }
    }

}
