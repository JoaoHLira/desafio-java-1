package br.com.joaolira.desafiojava1;

import lombok.Getter;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class DesafioJava1Application {

	@GetMapping
	public String getHomeTest() {
		return "Desafio java!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DesafioJava1Application.class, args);
	}

}


