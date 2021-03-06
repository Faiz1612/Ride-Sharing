package com.faiz.ride.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class LocationDetails {
    private int seats;
    private String source;
    private String destination;

    public LocationDetails(int seats, String source, String destination) {
        this.seats = seats;
        this.source = source;
        this.destination = destination;
    }
}
