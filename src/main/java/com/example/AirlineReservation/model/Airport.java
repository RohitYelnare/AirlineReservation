package com.example.AirlineReservation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Airport {

    @Id
    @GeneratedValue
    private Integer id;
    private String city;
    private String country;
    private String code_id;

    public Airport() {
    }

    public Airport(Integer id, String city, String country, String code_id) {
        this.id = id;
        this.city = city;
        this.country = country;
        this.code_id = code_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCode_id() {
        return code_id;
    }

    public void setCode_id(String code_id) {
        this.code_id = code_id;
    }
}
