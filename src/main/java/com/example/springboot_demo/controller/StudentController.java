package com.example.springboot_demo.controller;

// Create a REST controller class StudentController with the following methods: createStudent, readAllStudents, readStudent, updateStudent, deleteStudent. The class should have a private final field of type StudentService. The class should have a constructor with a parameter of type StudentService. The createStudent method should accept a Student object as a parameter and return the created Student object. The readAllStudents method should return a list of all students. The readStudent method should accept an integer id as a parameter and return the student with the given id. The updateStudent method should accept a Student object as a parameter and return the updated Student object. The deleteStudent method should accept an integer id as a parameter and return void. The class should have a method validateStudent which should accept a Student object as a parameter and return a boolean value. The method should return true if all fields are valid, otherwise false. Add the validation for email address check. The class should have the following annotations: @RestController, @RequestMapping("/students")
import com.example.springboot_demo.entity.Student;
import com.example.springboot_demo.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        if (studentService.validateStudent(student)) {
            return new ResponseEntity<>(studentService.createStudent(student), HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @GetMapping
    public List<Student> readAllStudents() {
        return studentService.readAllStudents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> readStudent(@PathVariable int id) {
        Student student = studentService.readStudent(id);
        if (student != null) {
            return new ResponseEntity<>(student, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        if (studentService.validateStudent(student)) {
            return new ResponseEntity<>(studentService.updateStudent(student), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/validate")
    public boolean validateStudent(@RequestBody Student student) {
        return studentService.validateStudent(student);
    }
}