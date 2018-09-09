package com.andreitop.newco.dto;

import com.shelpablo.webcarcass.AbstractDto;

import java.io.Serializable;

public class TripDto extends AbstractDto implements Serializable {

    private static final long serialVersionUID = 5914366185889783660L;

    private String origin;
    private String destination;
    private Integer price;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
