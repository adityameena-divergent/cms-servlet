package com.divergentsl.cms.dao;

import javax.persistence.EntityManager;

import com.divergentsl.cms.entity.Admin;
import com.divergentsl.cms.utility.EntityManagerUtility;

public class AdminDaoImpl implements AdminDao {

	public Admin login(String username) {
		
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
//		entityManager.getTransaction().begin();
//		entityManager.persist(username);
//		entityManager.getTransaction().commit();
		
		Admin admin = entityManager.find(Admin.class, username);
		
		entityManager.close();
		return admin;
	}

}
