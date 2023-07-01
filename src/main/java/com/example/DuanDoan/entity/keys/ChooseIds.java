package com.example.DuanDoan.entity.keys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ChooseIds implements Serializable {

    @Column(name = "idCheckIn")
    private int idCheckIn;
    @Column(name = "idCheckOut")
    private int idCheckOut;

    public ChooseIds(){}
    public ChooseIds(int idCheckIn, int idCheckOut){
        this.idCheckIn = idCheckIn;
        this.idCheckOut = idCheckOut;
    }


    public int getIdCheckIn() {
        return idCheckIn;
    }

    public void setIdCheckIn(int idCheckIn) {
        this.idCheckIn = idCheckIn;
    }

    public int getIdCheckOut() {
        return idCheckOut;
    }

    public void setIdCheckOut(int idCheckOut) {
        this.idCheckOut = idCheckOut;
    }
}
