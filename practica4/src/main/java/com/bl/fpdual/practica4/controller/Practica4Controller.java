package com.bl.fpdual.practica4.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bl.fpdual.practica4.model.Person;
import com.bl.fpdual.practica4.model.Phone;
import com.bl.fpdual.practica4.repositories.IPersonRepository;
import com.bl.fpdual.practica4.repositories.IPhoneRepository;


@RestController
public class Practica4Controller {

	@Autowired
	private IPhoneRepository repositorioPhone; 
	
	@Autowired
	private IPersonRepository repositorioPersona;
	
	@GetMapping("/guarda")
	public String guarda() {
		Person persona = new Person();
		
//		persona.setId(1L);
		repositorioPersona.save(persona);

		Phone phone = new Phone();

		// phone.setId(1L);
		phone.setId(persona.getId()); // Rescatamos el ID del nuevo Person
		phone.setNumber("654372726");
		phone.setPerson(persona);
		
		
		repositorioPhone.save(phone);
		
		return "Phone " + phone.toString() + " Person: " + persona.toString();
	}
	
	@GetMapping("/listado")
	public String listado() {
		List<Phone> listaPhones = repositorioPhone.findAll();
		
		return Arrays.toString(listaPhones.toArray());
	}

	
	@GetMapping("/dame1")
	public String dame1() {
		List<Phone> listaPhones = repositorioPhone.findByNumber("654372726");
		
		return Arrays.toString(listaPhones.toArray());
	}


	
	@GetMapping("/busca")
	public String busca() {
		List<Phone> listaPhones = repositorioPhone.search("437");
		
		return Arrays.toString(listaPhones.toArray());
	}

	@GetMapping("/buscaNativo")
	public String buscaNativo() {
		List<Phone> listaPhones = repositorioPhone.searchNativo("437");
		
		return Arrays.toString(listaPhones.toArray());
	}
	
	
}
