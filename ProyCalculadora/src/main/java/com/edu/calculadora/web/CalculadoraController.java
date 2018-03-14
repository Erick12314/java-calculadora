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
		String msj = "";
		
		switch (calculadora.getOperacion()) {
		case '+':
			msj = "La suma de " + num1 + " y " + num2 + " es : " + (num1 + num2);
			break;
		case '-':
			msj = "La resta de " + num1 + " y " + num2 + " es : " + (num1 - num2);
			break;
		case '*':
			msj = "La multiplicación de " + num1 + " y " + num2 + " es : " + (num1 * num2);
			break;
		case '/':
			
			//NO SE PUEDE DIVIDIR UN NUMERO ENTRE CERO
			if (num2 != 0) {
				
				msj = "La división de " + num1 + " y " + num2 + " es : " + (num1 / num2);
				
			}else {
				
				msj = "El segundo número debe ser diferente de cero";
				
			}
			
			break;
		default:
			
			msj = "Las operaciones válidas son suma (+), resta (-), multiplicación (*), divisón (/)";
			
			break;
		}
		
		calculadora.setMensaje(msj);

		return "result";
	}
}
