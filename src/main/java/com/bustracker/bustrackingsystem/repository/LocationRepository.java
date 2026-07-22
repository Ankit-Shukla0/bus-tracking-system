package com.bustracker.bustrackingsystem.repository;

import com.bustracker.bustrackingsystem.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {
}