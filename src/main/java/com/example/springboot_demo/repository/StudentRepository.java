package com.example.springboot_demo.repository;

// Define a repository interface StudentRepository which extends JpaRepository for Student entity. The primary key of the entity is of type Integer. The repository should have create, read, update, delete operations for the entity.



import com.example.springboot_demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}