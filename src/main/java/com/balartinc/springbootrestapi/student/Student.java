package com.balartinc.springbootrestapi.student;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Student {
    private Long id;
    private String name;
    private String email;
    private String house;
    private LocalDate dob;
    private Integer age;

    public Student() {
    }

    public Student(Long id,
                   String name,
                   String email,
                   String house,
                   LocalDate dob,
                   Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.house = house;
        this.dob = dob;
        this.age = age;
    }

    public Student(String name,
                   String email,
                   String house,
                   LocalDate dob,
                   Integer age) {
        this.name = name;
        this.email = email;
        this.house = house;
        this.dob = dob;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", house='" + house + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
