package com.example.DuanDoan.payload.resquest;

public class CheckoutRequest {
    private String CCCDout;
    private String locationArrive;

    public String getCCCDout() {
        return CCCDout;
    }

    public void setCCCDout(String CCCDout) {
        this.CCCDout = CCCDout;
    }

    public String getLocationArrive() {
        return locationArrive;
    }

    public void setLocationArrive(String locationArrive) {
        this.locationArrive = locationArrive;
    }
}
