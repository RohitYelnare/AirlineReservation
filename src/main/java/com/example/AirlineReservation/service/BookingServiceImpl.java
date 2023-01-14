package com.example.AirlineReservation.service;


import com.example.AirlineReservation.model.Booking;
import com.example.AirlineReservation.model.Ticket;
import com.example.AirlineReservation.model.User;
import com.example.AirlineReservation.repository.BookingRepository;
import com.example.AirlineReservation.repository.TicketRepository;
import com.example.AirlineReservation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService{

    @Autowired
    private final BookingRepository bookingRepository;

    @Autowired
    private final TicketRepository ticketRepository;

    public BookingServiceImpl(BookingRepository bookingRepository, TicketRepository ticketRepository) {
        this.bookingRepository = bookingRepository;
        this.ticketRepository = ticketRepository;
    }

    @Override
    public List<Booking> getUserBookings(User user) {
        return bookingRepository.getUserBookings(user);
    }

    @Override
    public Ticket getUserTickets(User user, Booking booking) {
        return ticketRepository.getUserTickets(user, booking);
    }

    @Override
    public Ticket saveBooking(Ticket t) {
        return ticketRepository.save(t);
    }

}
