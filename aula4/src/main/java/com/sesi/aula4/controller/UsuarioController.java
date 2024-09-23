package com.sesi.aula4.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.sesi.aula4.model.Usuario;
import com.sesi.aula4.repository.UsuarioRepository;

@Controller
public class UsuarioController {
	@Autowired
	private UsuarioRepository usuarioRepository;
	@GetMapping("/usuarios")
	public String listarUsuario(Model modelo){
		
	
		modelo.addAttribute("usuarios", usuarioRepository.findAll());
		return "usuarios";
		
	}
}
