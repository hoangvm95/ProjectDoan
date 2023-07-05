package com.example.DuanDoan.service;

import com.example.DuanDoan.entity.PersonEntity;
import com.example.DuanDoan.payload.response.AllPersonResponse;
import com.example.DuanDoan.repository.PersonRepository;
import com.example.DuanDoan.service.imp.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService implements IPersonService {
    @Autowired
    PersonRepository personRepository;
    @Override
    public List<AllPersonResponse> findAllByCccd(String cccd) {
        List<AllPersonResponse> responseList = new ArrayList<>();

        for (PersonEntity data: personRepository.findAllByCccd(cccd)) {
            AllPersonResponse personResponse = new AllPersonResponse();
            personResponse.setCccd(data.getCccd());
            personResponse.setFullname(data.getFullname());
            personResponse.setAddressOnCccd(data.getAddressOnCccd());
            personResponse.setBirthday(data.getBirthday());
            personResponse.setGender(data.getGender());
            personResponse.setCurrentAddress(data.getCurrentAddress());
            personResponse.setPhoneNumber(data.getPhoneNumber());

            responseList.add(personResponse);
        }
        return responseList;
    }
}
