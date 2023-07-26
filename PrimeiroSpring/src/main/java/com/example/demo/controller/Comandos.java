package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Comandos {
	
	@GetMapping("/texto")
	public String mensagem() {
		return "Olá! Seja Bem Vindo";
	}
	@GetMapping("/produtos")
	public List<String> produtos() {
    List<String> lst = new ArrayList<String>();
    lst.add("Mouse");
    lst.add("Teclado");
    lst.add("Monitor");
    lst.add("SSD 480");
    
    return lst;
	}
		
}
	
	
	

