package com.db.jaegerclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.jaegerclient.service.JaegerClientService;


@RestController
@RequestMapping("/jaeger/client")
public class JaegerClientController {
	
	private JaegerClientService jaegerClientService;
	 
	public JaegerClientController(JaegerClientService jaegerClientService) {
		this.jaegerClientService = jaegerClientService; 
	} 
	
	@GetMapping("/{id}")
	public String get(@PathVariable("id") Integer id) {
		return jaegerClientService.get(id);
	}
	

}

