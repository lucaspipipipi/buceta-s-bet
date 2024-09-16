package com.sesi.Sistema_Login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.Sistema_Login.model.Papel;

public interface PapelRepository extends JpaRepository<Papel, Long>{
	Papel findByNomePapel(String nomePapel);
}
