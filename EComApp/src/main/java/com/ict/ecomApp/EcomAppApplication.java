package com.ict.ecomApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcomAppApplication {

	public static long totsellcount=0;

	public static void main(String[] args) {
		SpringApplication.run(EcomAppApplication.class, args);
	}
}
