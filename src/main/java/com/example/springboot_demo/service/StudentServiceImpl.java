package com.example.springboot_demo.service;

// Define a service interface StudentService with the methods to create, read, update, delete and validate the Student entity. The service should have a method to validate the entity. The method should return true if all fields are valid, otherwise false. Add the validation for email address check. It should use student repository to perform CRUD operations.

import com.example.springboot_demo.entity.Student;
import com.example.springboot_demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    @Transactional
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> readAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student readStudent(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    @Transactional
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public boolean validateStudent(Student student) {
        return student.validate();
    }
}