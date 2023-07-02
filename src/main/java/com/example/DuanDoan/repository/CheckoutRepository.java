package com.example.DuanDoan.repository;

import com.example.DuanDoan.entity.CheckOutEntity;
import com.example.DuanDoan.entity.keys.ChooseIds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckoutRepository extends JpaRepository<CheckOutEntity, ChooseIds> {

}
