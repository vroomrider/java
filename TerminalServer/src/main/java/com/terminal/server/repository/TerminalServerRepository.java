package com.terminal.server.repository;

import org.springframework.stereotype.Repository;

@Repository
public class TerminalServerRepository {

	public void releaseResoucre() {
		System.out.println("Resoucre Released.");
	}
}
