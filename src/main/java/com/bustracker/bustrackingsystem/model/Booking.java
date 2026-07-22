package com.bustracker.bustrackingsystem.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private Integer bookingId;

    @Column(name = "person_id")
    private int personId;

    @Column(name = "bus_id")
    private int busId;

    @Column(name = "booking_date")
    private LocalDate bookingDate;

    public Booking() {}

    public Booking(Integer bookingId, int personId, int busId, LocalDate bookingDate) {
        this.bookingId = bookingId;
        this.personId = personId;
        this.busId = busId;
        this.bookingDate = bookingDate;
    }

    public Integer getBookingId() { return bookingId; }
    public int getPersonId() { return personId; }
    public int getBusId() { return busId; }
    public LocalDate getBookingDate() { return bookingDate; }
}