package com.bl.fpdual;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bl.fpdual.modelo.MarvelCharacter;

public class Practica2 {
	
	private static EntityManager manager;
	
	private static EntityManagerFactory emf;

	
	public static void main(String[] args) {
		
		emf = Persistence.createEntityManagerFactory("Persistencia");
		manager = emf.createEntityManager();
		
		MarvelCharacter heroe1 = new MarvelCharacter("Antonio", "Thor", "Pedo", false);
		
		manager.getTransaction().begin();
		
		manager.persist(heroe1);
		
		manager.getTransaction().commit();
		
		List<MarvelCharacter> listaHerores = manager.createQuery("FROM marvel_character").getResultList();

		System.out.println(Arrays.toString(listaHerores.toArray()));
		
		
		emf.close();

		
	}
}
