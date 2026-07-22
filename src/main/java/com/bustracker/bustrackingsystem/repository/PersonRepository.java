package com.bustracker.bustrackingsystem.repository;

import com.bustracker.bustrackingsystem.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}