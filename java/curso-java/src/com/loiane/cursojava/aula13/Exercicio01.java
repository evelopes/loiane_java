package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		System.out.println("Digite um numero");
		int numeroUm = scan.nextInt();
		System.out.println("Digite o segundo numero");
		int numeroDois = scan.nextInt();
		System.out.println("A soma de " + numeroUm + " com " + numeroDois + " é: " + (numeroUm + numeroDois));
		
		System.out.println("Digite quatro notas para calcular a média: ");
		int nota1 = scan.nextInt();
		int nota2 = scan.nextInt();
		int nota3 = scan.nextInt();
		int nota4 = scan.nextInt();
		System.out.println("A média das notas é: " + (nota1 + nota2 + nota3 + nota4)/4);
	}
	
	
}
