package com.healthcare.service;

import java.util.List;

import com.healthcare.dao.PatientDao;
import com.healthcare.entity.Patient;

public class PatientService {

	PatientDao pd=new PatientDao();
	public String storePatient(Patient patient) {
		if(pd.storePatient(patient)>0) {
			return "Patient Stored successfully";
			
		}
		else {
			return"Patient not stored";
		}
	}
	
	public List<Patient> findAllPatient(){
		return pd.FindAllPatient();
	}
	
	public String deletePatient(int id) {
		if(pd.deletePatient(id)>0) {
			return "Patient deleted successfully";
			
		}
		else {
			return"Patient not present";
		}
}
	public Patient findPatient(int id) {

		return pd.findPatient(id);
	}
	public String updatePatient(Patient patient) {
		if(pd.updatePatient(patient)>0) {
			return"Patient Updated";
			
		}
		else {
			return "Patient Not Updated";
		}
	}
}
