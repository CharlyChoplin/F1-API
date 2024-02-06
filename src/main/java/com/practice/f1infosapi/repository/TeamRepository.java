package com.practice.f1infosapi.repository;

import com.practice.f1infosapi.entity.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<TeamEntity, Integer> {
}
