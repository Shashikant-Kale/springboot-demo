package com.example.springboot_demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int id;
    private String name;
    private int age;
    private int salary;

    public List<Employee> getAllEmployees() {
           // create a list of employees
              List<Employee> employees = List.of(
                new Employee(1, "John", 30, 70000),
                new Employee(2, "Mike", 25, 60000),
                new Employee(3, "Shashi", 35, 80000),
                new Employee(4, "Rahul", 40, 90000)
              );
              return employees;
    }
}
