package com.bustracker.bustrackingsystem.repository;

import com.bustracker.bustrackingsystem.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
}