package com.example.AirlineReservation.controller;


import com.example.AirlineReservation.model.Booking;
import com.example.AirlineReservation.model.Flight;
import com.example.AirlineReservation.model.Ticket;
import com.example.AirlineReservation.model.User;
import com.example.AirlineReservation.service.BookingService;
import com.example.AirlineReservation.service.FlightService;
import com.example.AirlineReservation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(value = "/v1/api")
@CrossOrigin
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @Autowired
    private UserService userService;

    @Autowired
    private FlightService flightService;


    @GetMapping("/booking")
    public List<Ticket> getUserTickets(@RequestParam(value="id", required = true) Integer id) {
        List<User> allUsers = userService.getAllUsers();
        User user = null;

        for(User u:allUsers) {
            if(u.getUser_id() == id) {
                user = u;
                break;
            }
        }

        List<Booking> userBookings = bookingService.getUserBookings(user);
        List<Ticket> userTickets = new ArrayList<>();

        int n = userBookings.size();

        for (Booking userBooking : userBookings) {
            Ticket ticket = bookingService.getUserTickets(user, userBooking);
            userTickets.add(ticket);
        }
        
        return userTickets;
    }

    @GetMapping("/book")
    public Ticket bookTicket(@RequestParam(value="id", required = true) Integer id,
                                   @RequestParam(value="u_id", required=true) Integer u_id) {
        List<Flight> allFlights = flightService.getAllFlights();
        Flight flight = null;

        for(Flight f : allFlights) {
            if(Objects.equals(f.getFlight_id(), id)) {
                flight = f;
                break;
            }
        }

        List<User> allUsers = userService.getAllUsers();
        User user = null;

        for(User u: allUsers) {
            if(Objects.equals(u.getUser_id(), u_id)) {
                user = u;
                break;
            }
        }

        Ticket t = new Ticket(flight.getRoute_id(), flight.getFlight_id(), user.getName(), flight.getDept_code(), flight.getArr_code(), flight.getDept_date(), flight.getDept_time());
        return bookingService.saveBooking(t);
    }
}
