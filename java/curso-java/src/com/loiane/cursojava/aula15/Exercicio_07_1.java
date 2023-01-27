package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicio_07_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite tr s numeros para varificar o maior");
		int numeroUm = scan.nextInt();
		int numeroDois = scan.nextInt();
		int numeroTres = scan.nextInt();
		int maior = numeroUm;
		int menor = numeroUm; 
				
		
		if(maior < numeroDois) {
			maior = numeroDois;
		} 
		if(maior < numeroTres) {
			maior = numeroTres;
		}
		
		if(menor > numeroDois) {
			menor = numeroDois;
		} 
		if(menor > numeroTres) {
			menor = numeroTres;
		}
		
		
		

		System.out.println("Maior È " + maior);
		System.out.println("Menor È " + menor);
	}
}