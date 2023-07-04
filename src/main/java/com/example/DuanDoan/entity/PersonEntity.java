package com.example.DuanDoan.entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name="person")
public class PersonEntity {
    @Id
    @Column(name ="cccd")
    private String cccd;

    @Column(name = "fullname")
    private String fullname;

    @Column(name="birthday")
    private Date birthday;

    @Column(name="addressOnCccd")
    private String addressOnCccd;

    @Column(name="currentAddress")
    private String currentAddress;

    @Column(name= "phoneNumber")
    private int phoneNumber;

    @Column(name="gender")
    private String gender;

    @Column(name="isStay")
    private boolean isStay;

    @Column(name="isArrive")
    private boolean isArrive;

    @Column(name="locationArrive")
    private String locationArrive;

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddressOnCccd() {
        return addressOnCccd;
    }

    public void setAddressOnCccd(String addressOnCccd) {
        this.addressOnCccd = addressOnCccd;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isStay() {
        return isStay;
    }

    public void setStay(boolean stay) {
        isStay = stay;
    }

    public boolean isArrive() {
        return isArrive;
    }

    public void setArrive(boolean arrive) {
        isArrive = arrive;
    }

    public String getLocationArrive() {
        return locationArrive;
    }

    public void setLocationArrive(String locationArrive) {
        this.locationArrive = locationArrive;
    }
}
