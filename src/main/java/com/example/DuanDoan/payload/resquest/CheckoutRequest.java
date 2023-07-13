package com.example.DuanDoan.payload.resquest;

import javax.validation.constraints.*;

public class CheckoutRequest {

    @NotNull(message = "Vui lòng nhập CMND từ 9-12 ký tự")
    @Min(9)
    @Max(12)
    @Positive
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
