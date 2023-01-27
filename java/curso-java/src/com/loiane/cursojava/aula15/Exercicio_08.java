package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicio_08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor dos produtos:");
		float prod1 = scan.nextFloat();
		float prod2 = scan.nextFloat();
		float prod3 = scan.nextFloat();
		float comprar;
		if(prod1 >= prod2) {
			comprar = prod2;
		}else {
			comprar = prod1;
		}
		if(comprar >= prod3) {
			comprar = prod3;
		}
		System.out.println("Melhor tem o valor: " + comprar);
		
		
	}
}
