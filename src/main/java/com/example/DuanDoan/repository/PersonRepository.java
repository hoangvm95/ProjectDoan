package com.example.DuanDoan.repository;

import com.example.DuanDoan.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity,String> {
    List<PersonEntity> findAllByCccd(String cccd);
}
