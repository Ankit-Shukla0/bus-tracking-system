package com.bustracker.bustrackingsystem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "bus")
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bus_id")
    private Integer busId;

    @Column(name = "bus_number")
    private String busNumber;

    @Column(name = "driver_name")
    private String driverName;

    private int capacity;

    @Column(name = "route_id")
    private int routeId;

    public Bus() {}

    public Bus(Integer busId, String busNumber, String driverName, int capacity, int routeId) {
        this.busId = busId;
        this.busNumber = busNumber;
        this.driverName = driverName;
        this.capacity = capacity;
        this.routeId = routeId;
    }

    public Integer getBusId() { return busId; }
    public String getBusNumber() { return busNumber; }
    public String getDriverName() { return driverName; }
    public int getCapacity() { return capacity; }
    public int getRouteId() { return routeId; }
}