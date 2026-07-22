package com.bustracker.bustrackingsystem.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "bus_location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private Integer locationId;

    @Column(name = "bus_id")
    private int busId;

    private double latitude;
    private double longitude;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Location() {}

    public Location(Integer locationId, int busId, double latitude, double longitude, LocalDateTime updatedAt) {
        this.locationId = locationId;
        this.busId = busId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.updatedAt = updatedAt;
    }

    public Integer getLocationId() { return locationId; }
    public int getBusId() { return busId; }
    public double getLatitude() { return latitude; }
    public double getLongitude() { return longitude; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }
}