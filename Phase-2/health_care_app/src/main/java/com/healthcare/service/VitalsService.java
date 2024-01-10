package com.healthcare.service;

import java.util.List;

import com.healthcare.dao.VitalsDao;
import com.healthcare.entity.Vitals;

public class VitalsService {
VitalsDao vd= new VitalsDao();
public List<Vitals> findAllVitals(){
	return vd.findAllVitals();
}

	public String storeVitals(Vitals vitals) {
		if(vd.storeVitals(vitals)>0) {
			return "Vital stored successfully";
		}else {
			return "Vital didn't stored";
		}
	}
	
	public String deleteVitals(int id) {
		if(vd.deleteVitals(id)>0) {
			return "Vitals deleted successfully";
			
		}
		else {
			return"Vitals not present";
		}
}
}
