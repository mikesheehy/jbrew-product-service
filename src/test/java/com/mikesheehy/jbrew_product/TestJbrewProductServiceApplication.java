package com.mikesheehy.jbrew_product;

import org.springframework.boot.SpringApplication;

public class TestJbrewProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(JbrewProductServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
