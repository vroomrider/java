package com.terminal.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TerminalClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(TerminalClientApplication.class, args);
	}

	@Bean
	public RestTemplate get() {
		return new RestTemplate();
	}

}
