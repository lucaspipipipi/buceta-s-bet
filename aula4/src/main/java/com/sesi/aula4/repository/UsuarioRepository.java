package com.sesi.aula4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.aula4.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{
}
