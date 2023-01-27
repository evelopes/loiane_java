package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicio_07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite trÊs numeros para varificar o maior");
		int numeroUm = scan.nextInt();
		int numeroDois = scan.nextInt();
		int numeroTres = scan.nextInt();
		int maior;
		int menor;
				
		
		if(numeroUm > numeroDois && numeroUm > numeroTres) {
			maior = numeroUm;
		} else if(numeroDois > numeroTres  && numeroDois > numeroUm) {
			maior = numeroDois;	
		} else {
			maior = numeroTres;
		}		
		
		if(numeroUm < numeroDois && numeroUm < numeroTres) {
			menor = numeroUm;
		} else if(numeroDois<numeroTres  && numeroDois < numeroUm) {
			menor = numeroDois;	
		} else {
			menor = numeroTres;
		}
		
		

		System.out.println("Maior é " + maior);
		System.out.println("Menor é " + menor);
	}
}
