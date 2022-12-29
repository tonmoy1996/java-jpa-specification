package com.jpa.specification;

import com.jpa.specification.config.ProductRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpecificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpecificationApplication.class, args);
	}

	@Bean
	ProductRunner  productRunnerSeed(){
		return  new ProductRunner();
	}

}
