package com.bl.fpdual.practica4.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bl.fpdual.practica4.model.Phone;

public interface IPhoneRepository extends JpaRepository<Phone, Long>{

	List<Phone> findByNumber(String number);
	
	// And
	// Or
	// Between
	// LessThan
	// LessThanEqual
	// GreaterThan
	
// El método es muy largo
//	List<Phone> findByNumberContainingOrCampo2Containing(String number, String campo2);

// Verificaciones
	
	boolean existsByNumber(String number);

	// consulta JPQL
	@Query(value = "SELECT p FROM Phone p WHERE p.number LIKE %:filtro%")
	List<Phone> search(@Param("filtro") String filtro);
	
	// consulta Nativa
	@Query(value = "SELECT * FROM Phone WHERE number LIKE %:filtro%",
			nativeQuery = true)
	List<Phone> searchNativo(@Param("filtro") String filtro);

	
}
