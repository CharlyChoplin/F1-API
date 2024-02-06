package com.practice.f1infosapi.repository;

import com.practice.f1infosapi.entity.DriverEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<DriverEntity, Integer> {
}
