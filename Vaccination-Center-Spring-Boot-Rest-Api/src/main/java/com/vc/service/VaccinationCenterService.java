package com.vc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vc.entity.VaccinationCenter;
import com.vc.repository.VaccinationRepository;
@Service
public class VaccinationCenterService {
	@Autowired
	VaccinationRepository vaccinationRepository;
	

	public List<VaccinationCenter> findAllVaccinationCenter() {
		return vaccinationRepository.findAll();
	}
	
	public String findSpecifidVaccinationCenter(int cid) {
		Optional<VaccinationCenter> result = vaccinationRepository.findById(cid);
		if(result.isPresent()) {
			VaccinationCenter c  = result.get();
			return c.toString();
		}else {
			return "Vaccination Center details not present in database";
		}
	}
}
