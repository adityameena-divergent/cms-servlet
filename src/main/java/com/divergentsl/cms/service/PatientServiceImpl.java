package com.divergentsl.cms.service;

import java.util.List;

import com.divergentsl.cms.dao.BaseDAO;
import com.divergentsl.cms.dao.PatientDaoImpl;
import com.divergentsl.cms.entity.Patient;

public class PatientServiceImpl implements PatientService {

	public void insert(int patientId, String patientName, String gender, int age, int weight, int contactNumber, String address) {
		
		BaseDAO<Patient> patientDao = new PatientDaoImpl();
		
		Patient patient = new Patient();
		patient.setId(patientId);
		patient.setName(patientName);
		patient.setGender(gender);
		patient.setAge(age);
		patient.setWeight(weight);
		patient.setContactNumber(contactNumber);
		patient.setAddress(address);
		
		patientDao.insert(patient);
		
	}

	public List<Patient> findAll() {
		BaseDAO<Patient> patientDao = new PatientDaoImpl();
		
		return patientDao.findAll();
	}

	
	
}
