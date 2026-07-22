package com.bustracker.bustrackingsystem.controller;

import com.bustracker.bustrackingsystem.model.Person;
import com.bustracker.bustrackingsystem.model.Student;
import com.bustracker.bustrackingsystem.model.Passenger;
import com.bustracker.bustrackingsystem.repository.PersonRepository;
import com.bustracker.bustrackingsystem.repository.StudentRepository;
import com.bustracker.bustrackingsystem.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private PassengerRepository passengerRepository;

    @GetMapping("/persons")
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @GetMapping("/passengers")
    public List<Passenger> getAllPassengers() {
        return passengerRepository.findAll();
    }

    @PostMapping("/passengers")
    public Passenger addPassenger(@RequestBody Passenger passenger) {
        return passengerRepository.save(passenger);
    }
}