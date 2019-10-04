package com.victor.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Scanner;


@SpringBootApplication
public class ProjetoSpringBootApplication {

	private static Scanner scanner;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoSpringBootApplication.class, args);

		scanner = new Scanner(System.in);

		ArrayList<Integer> pSequencia = new ArrayList<Integer>();
		
		System.out.println("Informe a Sequência Fibonacci - ");
		int vEntrada = scanner.nextInt();
		
		if (vEntrada == 1) {
			pSequencia.add(0);
			pSequencia.add(1);
		} if (vEntrada >= 2) {
			  pSequencia.add(0);
			  pSequencia.add(1);
			  pSequencia.add(1);
		  }
		
		fibonacci(vEntrada, pSequencia);
		System.out.println("Valor da Sequência: " + pSequencia);
	}

	static int fibonacci(int vNumero, ArrayList<Integer> pSequencia) {
		
		if (vNumero == 2 || vNumero == 1) {
			return 1;
		} else {
			int vFibonacci = fibonacci(vNumero - 1, pSequencia) + fibonacci(vNumero - 2, pSequencia);
			if (!pSequencia.contains(vFibonacci))
				pSequencia.add(vFibonacci);
			return vFibonacci;
		}
	}
}

