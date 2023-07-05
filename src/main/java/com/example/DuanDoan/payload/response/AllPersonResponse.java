package com.example.DuanDoan.payload.response;


import java.util.Date;

public class AllPersonResponse {

    private String cccd;

    private String fullname;

    private Date birthday;

    private String addressOnCccd;

    private String currentAddress;

    private int phoneNumber;

    private String gender;

    private boolean isStay;

    private boolean isArrive;

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
