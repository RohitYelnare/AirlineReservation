package com.example.AirlineReservation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Flight {

    @Id
    private Integer flight_id;
    private int aircraft_id, route_id, fare, seats_left;
    private String dept_code, arr_code;
    private LocalDate dept_date;
    private LocalTime dept_time, arr_time;


    public Flight() {
    }

    public Flight(Integer flight_id, int aircraft_id, int route_id, int fare, int seats_left, String dept_code, String arr_code, LocalDate dept_date, LocalTime dept_time, LocalTime arr_time) {
        this.flight_id = flight_id;
        this.aircraft_id = aircraft_id;
        this.route_id = route_id;
        this.fare = fare;
        this.seats_left = seats_left;
        this.dept_code = dept_code;
        this.arr_code = arr_code;
        this.dept_date = dept_date;
        this.dept_time = dept_time;
        this.arr_time = arr_time;
    }


    public Integer getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(Integer flight_id) {
        this.flight_id = flight_id;
    }

    public int getAircraft_id() {
        return aircraft_id;
    }

    public void setAircraft_id(int aircraft_id) {
        this.aircraft_id = aircraft_id;
    }

    public int getRoute_id() {
        return route_id;
    }

    public void setRoute_id(int route_id) {
        this.route_id = route_id;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public int getSeats_left() {
        return seats_left;
    }

    public void setSeats_left(int seats_left) {
        this.seats_left = seats_left;
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

    public LocalTime getArr_time() {
        return arr_time;
    }

    public void setArr_time(LocalTime arr_time) {
        this.arr_time = arr_time;
    }
}
