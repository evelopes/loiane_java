package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicio_05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite duas notas");
		double notaUm = entrada.nextDouble();
		double notaDois = entrada.nextDouble();
		double media = (notaUm + notaDois) / 2;
		
		if(media == 10) {
			System.out.println("Aprovado com Distinção!");
		}else if(media >= 7) {
			System.out.println("Aprovado!");
		}else if(media < 7) {
			System.out.println("Reprovado!");
		}
	}
}
