package com.db.jaegerserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JaegerServerService {

	@Autowired
	private RestTemplate restTemplate;
	
	public String get(Integer id) {
		final String uri = "http://numbersapi.com/" +id;
		String result = restTemplate.getForObject(uri, String.class);
	    return result;
	}
}
