package com.example.AirlineReservation.repository;

import com.example.AirlineReservation.model.Airport;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Integer> {

    @Query(value="SELECT * FROM airport", nativeQuery = true)
    List<Airport> findAllAirport();
}
