package com.example.springboot_demo.service;

// Define a service interface StudentService with the methods to create, read, update, delete and validate the Student entity. The service should have a method to validate the entity. The method should return true if all fields are valid, otherwise false. Add the validation for email address check

import com.example.springboot_demo.entity.Student;

import java.util.List;

public interface StudentService {
    Student createStudent(Student student);
    List<Student> readAllStudents();
    Student readStudent(int id);
    Student updateStudent(Student student);
    void deleteStudent(int id);
    boolean validateStudent(Student student);
}
