package com.terminal.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.terminal.client.repository.TerminalClientRepository;

@Service
public class TerminalClientService {

	@Autowired
	private TerminalClientRepository repository;

	public String validateConnService() {

		repository.validatePortAvailability();
		System.out.println("inside conn service");
		return "validated";
	}
}
