package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicio_02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número para verificar se é POSITIVO ou NEGATIVO");
		int numero = entrada.nextInt();
		
		if(numero >= 0) {
			System.out.println("É um número positivo!");
		}else {
			System.out.println("É um numero negativo!");
			
		}
	}
}
