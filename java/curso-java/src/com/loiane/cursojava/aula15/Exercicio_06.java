package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicio_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite tr s numeros para varificar o maior");
		int numeroUm = scan.nextInt();
		int numeroDois = scan.nextInt();
		int numeroTres = scan.nextInt();
		int maior = numeroUm;
		
		if(maior < numeroDois) {
			maior = numeroDois;
		}
		if(maior < numeroTres) {
			maior = numeroTres;
		}
		System.out.println(maior);
	}
}
