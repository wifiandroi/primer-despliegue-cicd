package com.github.actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsApplication {

	@GetMapping("/hola")
	public String prueba() {
		return ":::: Joseph ::: ";
	}

	@GetMapping("/welcome")
	public String welcome() {
		return ":::: Joseph2 ::: ";
	}

	@GetMapping("/trajegithub")
	public String congiyhub() {
		return ":::: baje y subi cambios ::: ";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubActionsApplication.class, args);
	}

}
