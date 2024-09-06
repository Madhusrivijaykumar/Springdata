package com.example.demo.Entity;


import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class Employee {
        @Id
        private String id;
        private String employeeName;
        private String employeeEmail;
        private String location;


    }


