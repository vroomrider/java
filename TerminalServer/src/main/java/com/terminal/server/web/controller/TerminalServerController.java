package com.terminal.server.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

import com.terminal.server.service.TerminalServerService;
import com.terminal.server.web.model.MessagePayload;

@RestController
public class TerminalServerController implements Runnable {

	@Autowired
	private TerminalServerService service;

	@GetMapping(name = "/get")
	public String checkPoolConn() {

		TerminalServerController controller = new TerminalServerController();
		Thread thread = new Thread(controller);
		thread.start();
		// message

		service.releaseResource();
		System.out.println("Checking Connection");
		return "Connection Available";
	}

	@PostMapping(name = "/getConn")
	public void getConnection(@RequestPayload MessagePayload messagePayload) {

	}

	@Override
	public void run() {
		System.out.println("Thread Group");

	}
}
