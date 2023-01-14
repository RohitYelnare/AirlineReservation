package com.example.AirlineReservation.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
public class Ticket {

    @Id
    @GeneratedValue
    private Integer ticket_id;
    private int route_id;
    private Integer flight_id, seat_no;
    private String name, dept_code, arr_code;
    private LocalDate dept_date;
    private LocalTime dept_time;
    private LocalDateTime booking_timestamp;

    public Ticket() {
    }

    public Ticket(Integer ticket_id, int route_id, Integer flight_id, Integer seat_no, String name, String dept_code, String arr_code, LocalDate dept_date, LocalTime dept_time, LocalDateTime booking_timestamp) {
        this.ticket_id = ticket_id;
        this.route_id = route_id;
        this.flight_id = flight_id;
        this.seat_no = seat_no;
        this.name = name;
        this.dept_code = dept_code;
        this.arr_code = arr_code;
        this.dept_date = dept_date;
        this.dept_time = dept_time;
        this.booking_timestamp = booking_timestamp;
    }
    public Ticket(int route_id, Integer flight_id, String name, String dept_code, String arr_code, LocalDate dept_date, LocalTime dept_time) {
        this.route_id = route_id;
        this.flight_id = flight_id;
        this.name = name;
        this.dept_code = dept_code;
        this.arr_code = arr_code;
        this.dept_date = dept_date;
        this.dept_time = dept_time;
    }

    public Integer getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(Integer ticket_id) {
        this.ticket_id = ticket_id;
    }

    public int getRoute_id() {
        return route_id;
    }

    public void setRoute_id(int route_id) {
        this.route_id = route_id;
    }

    public Integer getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(Integer flight_id) {
        this.flight_id = flight_id;
    }

    public Integer getSeat_no() {
        return seat_no;
    }

    public void setSeat_no(Integer seat_no) {
        this.seat_no = seat_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept_code() {
        return dept_code;
    }

    public void setDept_code(String dept_code) {
        this.dept_code = dept_code;
    }

    public String getArr_code() {
        return arr_code;
    }

    public void setArr_code(String arr_code) {
        this.arr_code = arr_code;
    }

    public LocalDate getDept_date() {
        return dept_date;
    }

    public void setDept_date(LocalDate dept_date) {
        this.dept_date = dept_date;
    }

    public LocalTime getDept_time() {
        return dept_time;
    }

    public void setDept_time(LocalTime dept_time) {
        this.dept_time = dept_time;
    }

    public LocalDateTime getBooking_timestamp() {
        return booking_timestamp;
    }

    public void setBooking_timestamp(LocalDateTime booking_timestamp) {
        this.booking_timestamp = booking_timestamp;
    }
}
