package com.example.DuanDoan.service;

import com.example.DuanDoan.entity.PersonEntity;
import com.example.DuanDoan.payload.resquest.CheckInRequest;
import com.example.DuanDoan.repository.CheckInRepository;
import com.example.DuanDoan.service.imp.ICheckInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckInService  implements ICheckInService {

    @Autowired
    CheckInRepository checkInRepository;

    @Override
    public boolean addPersonCheckIn(CheckInRequest checkInRequest) {

        try{
            PersonEntity person = new PersonEntity();
            person.setCccd(checkInRequest.getCccd());
            person.setFullname(checkInRequest.getFullname());
            person.setBirthday(checkInRequest.getBirthday());
            person.setGender(checkInRequest.getGender());
            person.setAddress_on_cccd(checkInRequest.getAddress_on_cccd());
            person.setCurrent_address(checkInRequest.getCurrent_address());
            person.setPhone_number(checkInRequest.getPhone_number());
            person.setIs_stay(checkInRequest.isIs_stay());
            person.setIs_arrive(checkInRequest.isIs_arrive());

            checkInRepository.save(person);
//            System.out.println("sdf");

            return true;
        }catch (Exception e){
            System.out.println("Vui lòng nhập lại thông tin");
            return false;
        }
    }
}
