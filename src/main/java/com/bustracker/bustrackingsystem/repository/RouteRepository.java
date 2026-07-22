package com.bustracker.bustrackingsystem.repository;

import com.bustracker.bustrackingsystem.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RouteRepository extends JpaRepository<Route, Integer> {
}