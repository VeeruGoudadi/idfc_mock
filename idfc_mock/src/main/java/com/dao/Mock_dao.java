package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import com.dto.Mock_dto;

@Component
public class Mock_dao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	public void inserting(Mock_dto dto) {
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();
		
	}


	public Mock_dto fetchdetails(int id) {
		Mock_dto dto=entityManager.find(Mock_dto.class,id);
		return dto;
	}
	

}
