package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exercicio_14 {
	public static void main(String[] args) {
		float excesso, multa;
		Scanner scan = new Scanner(System.in);
		float peso = scan.nextFloat();
		if(peso >= 50) {
			excesso = peso - 50;
			multa = excesso * 4;
			System.out.println("Excesso: " + excesso);
			System.out.println("Multa: R$" + multa);
		}else {
			System.out.println("Excesso: 0");
			System.out.println("Multa: R$0");
		}
	}
}
