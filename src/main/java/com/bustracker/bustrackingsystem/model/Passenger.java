package com.bustracker.bustrackingsystem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "passenger")
@PrimaryKeyJoinColumn(name = "person_id")
public class Passenger extends Person {

    @Column(name = "ticket_type")
    private String ticketType;

    public Passenger() {}

    public Passenger(int personId, String name, String email, String phone, String ticketType) {
        super(personId, name, email, phone);
        this.ticketType = ticketType;
    }

    public String getTicketType() { return ticketType; }

    @Override
    public String getPersonType() {
        return "PASSENGER";
    }
}