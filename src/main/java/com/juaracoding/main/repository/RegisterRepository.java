package com.juaracoding.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.juaracoding.main.entity.Register;

public interface RegisterRepository extends CrudRepository <Register, Long>{
	@Query(value = "select * from register where nama LIKE %?%", nativeQuery=true)
	List<Register>findByNama (String nama);
	@Query(value = "select * from register where email LIKE %?%", nativeQuery=true)
	List<Register>findByEmail (String email);
	@Query(value = "select * from register where phone LIKE %?%", nativeQuery=true)
	List<Register>findByPhone (String phone);
	@Query(value = "select * from register where addres LIKE %?%", nativeQuery=true)
	List<Register>findByAddres (String addres);
	
	
	
}
