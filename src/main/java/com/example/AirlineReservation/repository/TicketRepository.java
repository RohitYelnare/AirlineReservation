package com.example.AirlineReservation.repository;


import com.example.AirlineReservation.model.Booking;
import com.example.AirlineReservation.model.Ticket;
import com.example.AirlineReservation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {

    @Query(value = "select p.name, f.dept_time, f.dept_date, r.dept_code, r.arr_code, t.ticket_id, f.route_id, f.flight_id, t.seat_no, b.booking_timestamp from booking b, ticket t, passenger p, flight f, route r where user_id=:#{#user.user_id} and f.flight_id=t.flight_id and b.booking_id=:#{#booking.booking_id} and b.booking_id=t.booking_id and f.route_id=r.route_id and p.ticket_id=t.ticket_id", nativeQuery = true)
    Ticket getUserTickets(@Param("user") User user, @Param("booking") Booking booking);
}
