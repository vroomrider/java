package com.terminal.client.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class TerminalClientRepository {

	@Autowired
	private RestTemplate restTemplate;

	public String validatePortAvailability() {
		String response = restTemplate.getForObject("http://localhost:8084/get", String.class);
		System.out.println(response);
		return "Available";
	}
}
