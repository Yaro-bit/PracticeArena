package com.yaro.d2d.repository;

import jakarta.validation.constraints.NotEmpty;

public class Adr {

    private String id;

    @NotEmpty(message = "Street is required")
    private String street;

    @NotEmpty(message = "City is required")
    private String city;

    @NotEmpty(message = "ZIP code is required")
    private String zip;

    // Constructor, Getters, Setters, etc.

    public Adr(String id, String street, String city, String zip) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.zip = zip;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
