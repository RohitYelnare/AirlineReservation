package com.example.AirlineReservation.service;


import com.example.AirlineReservation.model.Booking;
import com.example.AirlineReservation.model.Ticket;
import com.example.AirlineReservation.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookingService {

    List<Booking> getUserBookings(User user);

    Ticket getUserTickets(User user, Booking booking);

    Ticket saveBooking(Ticket t);

}
