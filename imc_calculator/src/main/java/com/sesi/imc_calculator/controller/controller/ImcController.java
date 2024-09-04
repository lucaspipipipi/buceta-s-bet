package com.sesi.imc_calculator.controller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sesi.imc_calculator.model.model.Pessoa;
import com.sesi.imc_calculator.repository.Repository.PessoaRepository;

@Controller
public class ImcController {
	
	private PessoaRepository pessoaRepository;
	
	@GetMapping("/")
	public String showForm() {
		return "form";	
	}
	
	@PostMapping("/calcular")
	public String calcularIMC(@RequestParam String nome,@RequestParam double altura,@RequestParam double peso, Model model) {
		double imc = peso  (altura * altura);
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(nome);
		pessoa.setPeso(imc);
		pessoa.setAltura(altura);
		pessoa.setImc(imc);
		
		pessoaRepository.save(pessoa);
		return "form";
		
		
	}
}
