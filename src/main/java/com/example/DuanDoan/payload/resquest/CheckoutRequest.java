package com.example.DuanDoan.payload.resquest;

public class CheckoutRequest {
    private String cccd;
    private String locationArrive;

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getLocationArrive() {
        return locationArrive;
    }

    public void setLocationArrive(String locationArrive) {
        this.locationArrive = locationArrive;
    }
}
