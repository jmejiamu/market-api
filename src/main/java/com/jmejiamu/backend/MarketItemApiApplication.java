package com.jmejiamu.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.jmejiamu.backend.domain.MenItemRepository;
import com.jmejiamu.backend.domain.MenItems;

@SpringBootApplication
public class MarketItemApiApplication {

	@Autowired
	private MenItemRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(MarketItemApiApplication.class, args);

	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			MenItems men = new MenItems("Test description", "Test Name", "test URL");
			repository.save(men);
		};
	}

}
