package com.example.DuanDoan.entity;

import javax.persistence.*;

@Entity(name = "checkin")
public class CheckInEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "fullname")
    private String fullname;

    @Column(name = "CCCDin")
    private String CCCDin;

    @Column(name = "addressOnId")
    private String addressOnId ;

    @Column(name ="address")
    private String address;

    @Column(name ="phoneNumber")
    private int phoneNumber;

    @Column(name = "gender")
    private String gender;

    @Column(name = "tabernacle")
    private String tabernacle;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getCCCDin() {
        return CCCDin;
    }

    public void setCCCDin(String CCCDin) {
        this.CCCDin = CCCDin;
    }

    public String getAddressOnId() {
        return addressOnId;
    }

    public void setAddressOnId(String addressOnId) {
        this.addressOnId = addressOnId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getTabernacle() {
        return tabernacle;
    }

    public void setTabernacle(String tabernacle) {
        this.tabernacle = tabernacle;
    }
}
