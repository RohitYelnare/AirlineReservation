package com.example.AirlineReservation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalTime;


@Entity
public class FlightById {

    @Id
    private Integer flight_id;
    private int fare;
    private String dept_code, arr_code, dept_city, arr_city, dept_name, arr_name;
    private LocalDate dept_date;
    private LocalTime dept_time, arr_time;

    public FlightById() {
    }

    public FlightById(Integer flight_id, int fare, LocalDate dept_date, String dept_code, String arr_code, LocalTime dept_time, LocalTime arr_time, String dept_city, String dept_name, String arr_city, String arr_name) {
        this.flight_id = flight_id;
        this.fare = fare;
        this.dept_date = dept_date;
        this.dept_code = dept_code;
        this.arr_code = arr_code;
        this.dept_time = dept_time;
        this.arr_time = arr_time;
        this.dept_city = dept_city;
        this.dept_name = dept_name;
        this.arr_city = arr_city;
        this.arr_name = arr_name;
    }


    public Integer getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(Integer flight_id) {
        this.flight_id = flight_id;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
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

    public String getDept_city() {
        return dept_city;
    }

    public void setDept_city(String dept_city) {
        this.dept_city = dept_city;
    }

    public String getArr_city() {
        return arr_city;
    }

    public void setArr_city(String arr_city) {
        this.arr_city = arr_city;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getArr_name() {
        return arr_name;
    }

    public void setArr_name(String arr_name) {
        this.arr_name = arr_name;
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
