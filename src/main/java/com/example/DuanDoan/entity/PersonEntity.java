package com.example.DuanDoan.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "person")
public class PersonEntity {
    @Id
    @Column(length = 30)
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cccd;

    @Column(name = "fullname")
    private String fullname;

    @Column(name="birthday")
    private Date birthday;

    @Column(name="address_on_cccd")
    private String address_on_cccd;

    @Column(name="current_address")
    private String current_address;

    @Column(name= "phone_number")
    private int phone_number;

    @Column(name="gender")
    private String gender;

    @Column(name="is_stay")
    private boolean is_stay;

    @Column(name="is_arrive")
    private boolean is_arrive;

    @Column(name="location_arrive")
    private String location_arrive;

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

    public String getAddress_on_cccd() {
        return address_on_cccd;
    }

    public void setAddress_on_cccd(String address_on_cccd) {
        this.address_on_cccd = address_on_cccd;
    }

    public String getCurrent_address() {
        return current_address;
    }

    public void setCurrent_address(String current_address) {
        this.current_address = current_address;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isIs_stay() {
        return is_stay;
    }

    public void setIs_stay(boolean is_stay) {
        this.is_stay = is_stay;
    }

    public boolean isIs_arrive() {
        return is_arrive;
    }

    public void setIs_arrive(boolean is_arrive) {
        this.is_arrive = is_arrive;
    }

    public String getLocation_arrive() {
        return location_arrive;
    }

    public void setLocation_arrive(String location_arrive) {
        this.location_arrive = location_arrive;
    }
}
