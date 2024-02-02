package com.practice.f1infosapi.repository;

import com.practice.f1infosapi.entity.PilotesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PilotesRepository extends JpaRepository<PilotesEntity, Integer> {
}
