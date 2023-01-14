package com.example.AirlineReservation.service;

import com.example.AirlineReservation.model.Airport;
import com.example.AirlineReservation.model.Flight;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public interface FlightService {

    List<Flight> getAllFlights();

    List<Integer> getFlightSeats(Flight flight);

    List<Flight> searchFlights(LocalDate date, String a1, String a2);
}
