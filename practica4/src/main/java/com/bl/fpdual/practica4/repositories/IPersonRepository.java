package com.bl.fpdual.practica4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bl.fpdual.practica4.model.Person;

public interface IPersonRepository extends JpaRepository<Person, Long> {

}
