package com.db.jaegerserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.jaegerserver.service.JaegerServerService;


@RestController
@RequestMapping("/jaeger/server")
public class JaegerServerController {

	private JaegerServerService jaegerServerService;
	 
	public JaegerServerController(JaegerServerService jaegerServerService) {
		this.jaegerServerService = jaegerServerService; 
	} 
	
	@GetMapping("/{id}")
	public String get(@PathVariable("id") Integer id) {
		return jaegerServerService.get(id);
	}
}
