package com.juaracoding.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.juaracoding.main.entity.Buku;

public interface BukuRepository extends CrudRepository<Buku, Long> {
	
	List<Buku>findByJudulBuku (String judulBuku);

}
