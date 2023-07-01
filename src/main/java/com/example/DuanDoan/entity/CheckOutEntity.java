package com.example.DuanDoan.entity;

import javax.persistence.*;

@Entity(name = "checkout")
public class CheckOutEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "CCCDout")
    private String CCCDout;

    @Column(name = "locationArrive")
    private String locationArrive;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
