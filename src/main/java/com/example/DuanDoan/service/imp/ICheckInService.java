package com.example.DuanDoan.service.imp;

import com.example.DuanDoan.payload.resquest.CheckInRequest;

public interface ICheckInService {

    boolean addPersonCheckIn(CheckInRequest checkInRequest);
}
