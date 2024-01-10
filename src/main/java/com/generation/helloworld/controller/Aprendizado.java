package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("aprendiz")


public class Aprendizado {
	
	@GetMapping
	public String aprendizado() {
		return "Entre meus objetivos de aprendizagem dessa semana, está um aprimoramento nos conhecimentos de SpringBoot e banco de dados";
		
	
		

	}

	

}
