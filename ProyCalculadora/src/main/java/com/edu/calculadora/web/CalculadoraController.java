package com.edu.calculadora.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculadoraController {
	
	@GetMapping("/calculadora")
	private String calculadoraForm() {
		
		
		return null;
	}
	
	@PostMapping("/resultado")
	private String resultadoForm() {
		
		
		return null;
	}
}
