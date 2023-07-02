package com.example.DuanDoan.controller;

import com.example.DuanDoan.payload.response.BaseResponse;
import com.example.DuanDoan.payload.resquest.CheckoutRequest;
import com.example.DuanDoan.service.CheckoutService;
import com.example.DuanDoan.utils.JWTHelperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/checkout")

public class CheckoutController {
    @Autowired
    private CheckoutService checkoutService;
    @Autowired
    private JWTHelperUtils jwtHelperUtils;

    @PostMapping("")
    public ResponseEntity<?> addCheckout(@RequestBody CheckoutRequest checkoutRequest) {
        boolean isSuccess = checkoutService.addCheckout(checkoutRequest);

        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setMessage(isSuccess ? "Điền thông tin thành công" : "Điền thông tin thất bại");
        baseResponse.setData(isSuccess);

        return new ResponseEntity<>(baseResponse, HttpStatus.OK);
    }

    @GetMapping("/token")
    public ResponseEntity<?> index() {
        String token = jwtHelperUtils.generateToken("vmh123");
        String data = jwtHelperUtils.validToken(token);
        return new ResponseEntity<>(data, HttpStatus.OK);

    }
}
