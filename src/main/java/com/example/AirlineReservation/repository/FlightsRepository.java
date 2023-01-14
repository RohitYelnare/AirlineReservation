package com.example.AirlineReservation.repository;


import com.example.AirlineReservation.model.Airport;
import com.example.AirlineReservation.model.Flight;
import com.example.AirlineReservation.model.FlightById;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

@Repository
public interface FlightsRepository extends JpaRepository<Flight, Integer> {

    @Query(value="SELECT f.flight_id, f.route_id, f.aircraft_id, f.dept_time, f.arr_time, f.fare, f.dept_date, f.seats_left, r.dept_code, r.arr_code FROM flight f INNER JOIN route r ON f.route_id=r.route_id", nativeQuery=true)
    List<Flight> getAllFlights();

    //Search Flights Query


    // Get seats Query
    @Query(value = "SELECT seat_no FROM ticket t WHERE flight_id=:#{#flight.flight_id}", nativeQuery = true)
    List<Integer> getFlightSeats(@Param("flight") Flight flight);

}

