package com.example.springboot_demo.entity;

// create a class Student with fields id, name, age, email, address. Id will be auto generated. Use Lombok annotations.

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Version;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int age;
    private String email;
    private String address;

    @Version
    private int version;

    // Add method to validate all fields of the entity. The method should return true if all fields are valid, otherwise false. Add the validation for email address check
    public boolean validate(){
        if(this.name == null || this.name.isEmpty() || this.age <= 0 || this.email == null || this.email.isEmpty() || this.address == null || this.address.isEmpty()){
            return false;
        }
        return this.email.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
    }


}