package com.pushkarev.demodb.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "STUDENTS")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "faculty")
    private String faculty;

    @Column(name = "age")
    private String age;

    public Student(){

    }

    public Student(int id, String name, String surname, String faculty, String age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.age = age;
    }
}
