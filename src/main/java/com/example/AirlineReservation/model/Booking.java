package com.example.AirlineReservation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Booking {

    @Id
    @GeneratedValue
    private Integer booking_id;
    private Integer user_id;
    private LocalDateTime booking_timestamp;

    public Booking(Integer booking_id, Integer user_id, LocalDateTime booking_timestamp) {
        this.booking_id = booking_id;
        this.user_id = user_id;
        this.booking_timestamp = booking_timestamp;
    }

    public Booking() {
    }

    public Integer getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(Integer booking_id) {
        this.booking_id = booking_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public LocalDateTime getBooking_timestamp() {
        return booking_timestamp;
    }

    public void setBooking_timestamp(LocalDateTime booking_timestamp) {
        this.booking_timestamp = booking_timestamp;
    }
}
