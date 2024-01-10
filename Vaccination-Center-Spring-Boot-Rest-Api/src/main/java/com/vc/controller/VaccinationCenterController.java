package com.vc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vc.entity.VaccinationCenter;
import com.vc.service.VaccinationCenterService;

@RestController
public class VaccinationCenterController {

	@Autowired
	VaccinationCenterService vaccinationCenterService;
	
	// http://localhost:8086/vaccinationcenter
	
		@RequestMapping(value = "vaccinationcenter",method = RequestMethod.GET)
		public List<VaccinationCenter> findAllVaccinationCenter() {
			return vaccinationCenterService.findAllVaccinationCenter();
		}
		
		
		// http://localhost:8086/vaccinationcenter/100
		@RequestMapping(value = "vaccinationcenter/{vcid}",method = RequestMethod.GET)
		public String findVaccinationCenterById(@PathVariable("vcid") int vcid) {
			return vaccinationCenterService.findSpecifidVaccinationCenter(vcid);
		}
}
