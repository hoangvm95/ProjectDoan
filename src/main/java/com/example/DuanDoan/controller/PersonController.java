package com.example.DuanDoan.controller;

import com.example.DuanDoan.payload.response.BaseRespone;
import com.example.DuanDoan.payload.resquest.CheckoutRequest;
import com.example.DuanDoan.service.CheckoutService;
import com.example.DuanDoan.service.imp.ICheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/choose")
public class PersonController {

    @Autowired
    ICheckoutService iCheckoutService;
    @PostMapping("/checkout")
    public ResponseEntity<?> addPersonCheckout(CheckoutRequest checkoutRequest){
        Boolean isSuccess = iCheckoutService.addPersonCheckout(checkoutRequest);
        BaseRespone respone = new BaseRespone();
        respone.setMessage(isSuccess ? "Đăng ký thành công" : "Đăng ký thất bại");
        respone.setData(isSuccess);
        return new ResponseEntity<>(respone, HttpStatus.OK);
    }

}