package com.bustracker.bustrackingsystem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
@PrimaryKeyJoinColumn(name = "person_id")
public class Student extends Person {

    @Column(name = "roll_number")
    private String rollNumber;

    @Column(name = "class_section")
    private String classSection;

    public Student() {}

    public Student(int personId, String name, String email, String phone, String rollNumber, String classSection) {
        super(personId, name, email, phone);
        this.rollNumber = rollNumber;
        this.classSection = classSection;
    }

    public String getRollNumber() { return rollNumber; }
    public String getClassSection() { return classSection; }

    @Override
    public String getPersonType() {
        return "STUDENT";
    }
}