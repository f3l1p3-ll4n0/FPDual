package com.bl.fpdual;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Practica1 {

	
	final static Logger logger = LogManager.getLogger(Practica1.class);
	
	
	private static EntityManager manager;
	
	private static EntityManagerFactory emf;
	
	
	public static void main(String[] args) {

		logger.info("Entramos en Practica1");
		
		emf = Persistence.createEntityManagerFactory("Persistencia");
		manager = emf.createEntityManager();
		

	}

}
