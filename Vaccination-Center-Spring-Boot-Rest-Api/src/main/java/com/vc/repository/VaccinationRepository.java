package com.vc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vc.entity.VaccinationCenter;

@Repository
public interface VaccinationRepository extends JpaRepository<VaccinationCenter, Integer> {

}
