package com.bustracker.bustrackingsystem.controller;

import com.bustracker.bustrackingsystem.model.Route;
import com.bustracker.bustrackingsystem.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RouteController {

    @Autowired
    private RouteRepository routeRepository;

    @GetMapping("/routes")
    public List<Route> getAllRoutes() {
        return routeRepository.findAll();
    }

    @PostMapping("/routes")
    public Route addRoute(@RequestBody Route route) {
        return routeRepository.save(route);
    }
}