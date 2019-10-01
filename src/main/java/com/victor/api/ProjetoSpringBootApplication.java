package com.victor.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class ProjetoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoSpringBootApplication.class, args);
		System.out.println("Olá Mundo!");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero para recursividade: ");
        int num =  sc.nextInt();
        
        for(int i = 1; i<= num; i++) {
        fibonacciRec(i);
        System.out.println(fibonacciRec(i));
        }
	}
	
	public static int fibonacciRec(int recursiv) {
		if(recursiv == 1 || recursiv == 2) {
		   return 1;
	   } else {
		   return fibonacciRec(recursiv - 1) + fibonacciRec(recursiv - 2);		   
	   }
   }

}
