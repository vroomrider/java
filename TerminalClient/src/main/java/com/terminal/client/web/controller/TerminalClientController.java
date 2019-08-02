package com.terminal.client.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.terminal.client.service.TerminalClientService;

@RestController
public class TerminalClientController {

	@Autowired
	private TerminalClientService service;

	@GetMapping(name = "/validateConn")
	public String validateConnectionPool() {

		service.validateConnService();
		return "Validating Connection Availability";
	}
}
