package com.bustracker.bustrackingsystem.controller;

import com.bustracker.bustrackingsystem.model.Booking;
import com.bustracker.bustrackingsystem.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookingController {

    @Autowired
    private BookingRepository bookingRepository;

    @GetMapping("/bookings")
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    @PostMapping("/bookings")
    public Booking addBooking(@RequestBody Booking booking) {
        return bookingRepository.save(booking);
    }
}