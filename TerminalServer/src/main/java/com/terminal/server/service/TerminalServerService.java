package com.terminal.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.terminal.server.repository.TerminalServerRepository;

@Service
public class TerminalServerService {

	@Autowired
	private TerminalServerRepository repository;

	public void releaseResource() {
		repository.releaseResoucre();
		System.out.println("Releasing the resource from service class");
	}
}
