package com.victor.api;

public class Fibonacci {

    private static int[] vetAux = new int[50];
    private static int k;
 
    public int fiboAtual(int n) {      
    	k = 1; // inicializa k
        return recursao(n);
    }
 
    private int recursao(int n) {
        if (n < 0) { 
        	return vetAux[0];  
        } else { 
        if (k < 3) {
        	vetAux[n] = k - 1; 
            k++; 
        } else {
            vetAux[n] = vetAux[n + 1] + vetAux[n + 2]; 
        }
            return recursao(n - 1);
        }
    }
}
