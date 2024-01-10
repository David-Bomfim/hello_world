package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("BSM")



public class Bsm{

	@GetMapping
public String bsm() {
	return "Mentalidade de crescimento/ Orientação aos detalhes/ proatividade/ persistência/ comunicação/ trabalho em equipe/";
	
}
	

}
