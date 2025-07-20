package com.demo.consumer;

public class RiderLocation {
    private String riderId;
    private double latitude;
    private double longitude;

    public RiderLocation() {
    }

    public RiderLocation(String riderId, double latitude, double longitude) {
        this.riderId = riderId;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getRiderId() {
        return riderId;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }
}
