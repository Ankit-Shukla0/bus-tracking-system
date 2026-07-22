package com.bustracker.bustrackingsystem.repository;

import com.bustracker.bustrackingsystem.model.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus, Integer> {
}