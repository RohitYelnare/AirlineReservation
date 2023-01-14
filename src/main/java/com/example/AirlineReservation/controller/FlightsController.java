package com.example.AirlineReservation.controller;


import com.example.AirlineReservation.model.Flight;
import com.example.AirlineReservation.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/v1/api")
@CrossOrigin
public class FlightsController {

    @Autowired
    private FlightService flightService;

    @GetMapping("/allFlights")
    public List<Flight> getFlights() {
        return flightService.getAllFlights();
    }

    @GetMapping("/flightSeats")
    public List<Integer> flightSeats(@RequestParam(value="id", required = true) Integer id) {
        List<Flight> allFlights = flightService.getAllFlights();
        Flight flight = null;

        for(Flight f : allFlights) {
            if(Objects.equals(f.getFlight_id(), id)) {
                flight = f;
                break;
            }
        }

        return flightService.getFlightSeats(flight);
    }



    @GetMapping("/search")
    public List<Flight> searchUserFlights(@RequestParam(required = true, value = "dept") String dept,
                                          @RequestParam(required = true, value = "arr") String arr,
                                          @RequestParam(required = true, value = "date")LocalDate date) {
        return flightService.searchFlights(date, dept, arr);
    }
}
