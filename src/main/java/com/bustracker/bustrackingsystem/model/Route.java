package com.bustracker.bustrackingsystem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "route")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "route_id")
    private Integer routeId;

    @Column(name = "route_name")
    private String routeName;

    @Column(name = "start_point")
    private String startPoint;

    @Column(name = "end_point")
    private String endPoint;

    public Route() {}

    public Route(Integer routeId, String routeName, String startPoint, String endPoint) {
        this.routeId = routeId;
        this.routeName = routeName;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Integer getRouteId() { return routeId; }
    public String getRouteName() { return routeName; }
    public String getStartPoint() { return startPoint; }
    public String getEndPoint() { return endPoint; }
}