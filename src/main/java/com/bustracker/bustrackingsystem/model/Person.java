package com.bustracker.bustrackingsystem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "person")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private int personId;

    private String name;
    private String email;
    private String phone;

    public Person() {}

    public Person(int personId, String name, String email, String phone) {
        this.personId = personId;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public int getPersonId() { return personId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }

    public abstract String getPersonType();
}