package com.example.DuanDoan.service.imp;

import com.example.DuanDoan.payload.response.AllPersonResponse;

import java.util.List;

public interface IPersonService {
    List<AllPersonResponse> findAllByCccd(String cccd);
}
