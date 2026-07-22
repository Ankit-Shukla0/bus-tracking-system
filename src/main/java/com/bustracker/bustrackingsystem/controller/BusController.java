package com.bustracker.bustrackingsystem.controller;

import com.bustracker.bustrackingsystem.model.Bus;
import com.bustracker.bustrackingsystem.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BusController {

    @Autowired
    private BusRepository busRepository;

    @GetMapping("/buses")
    public List<Bus> getAllBuses() {
        return busRepository.findAll();
    }

    @PostMapping("/buses")
    public Bus addBus(@RequestBody Bus bus) {
        return busRepository.save(bus);
    }
}