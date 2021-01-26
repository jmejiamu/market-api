package com.jmejiamu.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.jmejiamu.backend.domain.MenItemRepository;
import com.jmejiamu.backend.domain.MenItems;
import com.jmejiamu.backend.domain.WomenItem;
import com.jmejiamu.backend.domain.WomenItemRepository;

@SpringBootApplication
public class MarketItemApiApplication {
	
	

//	@Autowired
//	private MenItemRepository menItemRepository;
//	
//	@Autowired
//	private WomenItemRepository womenItemRepository;

	public static void main(String[] args) {
		SpringApplication.run(MarketItemApiApplication.class, args);

	}

	//Inserting test data
//	@Bean
//	CommandLineRunner runner() {
//		return args -> {
//			// Inserting data to the database
//			MenItems men = new MenItems("Test description", "Test Name", "test URL");
//			menItemRepository.save(men);
//			
//			WomenItem women = new WomenItem("Women description Test","Women test name", "Woman test URL");
//			womenItemRepository.save(women);
//		};
//	}
	
	
	

}
