package com.example.DuanDoan.repository;

import com.example.DuanDoan.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckInRepository extends JpaRepository<PersonEntity,String> {

        }
