package com.db.jaegerclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JaegerClientService {

	@Autowired
	private RestTemplate restTemplate;
	
	public String get(Integer id) {
		final String uri = "http://localhost:8082/jaeger/server/" +id;
		String result = restTemplate.getForObject(uri, String.class);
	    return result;
	}
	
}
