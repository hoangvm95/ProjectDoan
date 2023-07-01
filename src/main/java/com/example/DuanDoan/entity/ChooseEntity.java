package com.example.DuanDoan.entity;

import com.example.DuanDoan.entity.keys.ChooseIds;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="choose")
public class ChooseEntity {


    @EmbeddedId
    private ChooseIds ids;
    @ManyToOne
    @JoinColumn(name = "idCheckIn", insertable = false,updatable = false)
    private CheckInEntity checkin;
    @ManyToOne
    @JoinColumn(name = "idCheckOut", insertable = false,updatable = false)
    private CheckOutEntity checkout;

    public ChooseIds getIds() {
        return ids;
    }

    public void setIds(ChooseIds ids) {
        this.ids = ids;
    }

    public CheckInEntity getCheckin() {
        return checkin;
    }

    public void setCheckin(CheckInEntity checkin) {
        this.checkin = checkin;
    }

    public CheckOutEntity getCheckout() {
        return checkout;
    }

    public void setCheckout(CheckOutEntity checkout) {
        this.checkout = checkout;
    }

}
