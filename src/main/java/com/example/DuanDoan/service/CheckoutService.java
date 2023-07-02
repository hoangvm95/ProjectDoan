package com.example.DuanDoan.service;

import com.example.DuanDoan.entity.CheckOutEntity;
import com.example.DuanDoan.payload.resquest.CheckoutRequest;
import com.example.DuanDoan.repository.CheckoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CheckoutService {
    @Autowired
    private CheckoutRepository checkoutRepository;

    public boolean addCheckout (CheckoutRequest checkoutRequest){
        try {
            CheckOutEntity checkOut = new CheckOutEntity();

            checkOut.setCCCDout(checkoutRequest.getCCCDout());
            checkOut.setLocationArrive(checkoutRequest.getLocationArrive());

            checkoutRepository.save(checkOut);
            return true;
        }catch(Exception e){
            System.out.println("Chưa nhập thông tin");
            return false;
        }
    }

}
