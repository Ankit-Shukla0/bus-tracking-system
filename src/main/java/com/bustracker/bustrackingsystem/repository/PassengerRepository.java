package com.bustracker.bustrackingsystem.repository;

import com.bustracker.bustrackingsystem.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {
}