package com.victor.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class ProjetoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoSpringBootApplication.class, args);
		
		Fibonacci fibo = new Fibonacci();
		
		for (int i = 0; i < 30; i++) {
	        System.out.println("(" + i + "):" + fibo.fiboAtual(i) + "\t");
	     }
	}
}

