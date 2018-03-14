package com.edu.calculadora.web;

import com.edu.calculadora.model.Calculadora;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculadoraController {

	@GetMapping("/calculadora")
	private String calculadoraForm(Model model) {

		model.addAttribute("calculadora", new Calculadora());

		return "calcForm";
	}

	@PostMapping("/resultado")
	private String resultadoForm(@ModelAttribute Calculadora calculadora) {
		
		double num1 = calculadora.getNumero1();
		double num2 = calculadora.getNumero2();
		
		switch (calculadora.getOperacion()) {
		case '+':
			calculadora.setResultado(num1 + num2);
			break;
		case '-':
			calculadora.setResultado(num1 - num2);
			break;
		case '*':
			calculadora.setResultado(num1 * num2);
			break;
		case '/':
			
			//NO SE PUEDE DIVIDIR UN NUMERO ENTRE CERO
			if (num2 != 0) {
				
				calculadora.setResultado(num1 / num2);
				
			}else {
				
				
				
			}
			
			break;
		default:
			
			
			
			break;
		}

		return "result";
	}
}
