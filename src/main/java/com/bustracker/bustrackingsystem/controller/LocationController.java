package com.bustracker.bustrackingsystem.controller;

import com.bustracker.bustrackingsystem.model.Location;
import com.bustracker.bustrackingsystem.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocationController {

    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @GetMapping("/locations")
    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }

    @PostMapping("/locations")
    public Location addLocation(@RequestBody Location location) {
        Location saved = locationRepository.save(location);
        messagingTemplate.convertAndSend("/topic/bus-location", saved);
        return saved;
    }
}