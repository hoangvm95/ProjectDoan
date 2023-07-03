package com.example.DuanDoan.service;

import com.example.DuanDoan.entity.PersonEntity;
import com.example.DuanDoan.payload.resquest.CheckoutRequest;
import com.example.DuanDoan.repository.CheckoutRepository;
import com.example.DuanDoan.service.imp.ICheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckoutService implements ICheckoutService {
    @Autowired
    CheckoutRepository checkoutRepository;
    @Override
    public boolean addPersonCheckout(CheckoutRequest checkoutRequest) {
        try {
            PersonEntity person = new PersonEntity();
            person.setCccd(checkoutRequest.getCccd());
            person.setLocationArrive(checkoutRequest.getLocationArrive());

            checkoutRepository.save(person);
            return true;
        }catch (Exception e){
            System.out.println("Nhập lại checkout");
            return false;
        }

    }
}
