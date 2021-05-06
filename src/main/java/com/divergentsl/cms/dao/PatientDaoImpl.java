package com.divergentsl.cms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.divergentsl.cms.entity.Patient;
import com.divergentsl.cms.utility.EntityManagerUtility;

public class PatientDaoImpl implements BaseDAO<Patient> {

	public void insert(Patient patient) {
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(patient);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public Patient find(int id) {
		return null;
	}

	public List<Patient> findAll() {
		
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		
		CriteriaQuery<Patient> criteriaQuery = entityManager.getCriteriaBuilder().createQuery(Patient.class);
		Root<Patient> root = criteriaQuery.from(Patient.class);
		
		List<Patient> patients = entityManager.createQuery(criteriaQuery).getResultList();
		entityManager.close();
		return patients;
		
	}

	public void remove(int id) {
		// TODO Auto-generated method stub
		
	}

}
