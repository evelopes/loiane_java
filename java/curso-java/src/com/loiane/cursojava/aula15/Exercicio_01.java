package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicio_01 {
	public static void main(String[] args) {
		//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
		
		Scanner dados = new Scanner(System.in);
		System.out.println("Digite dois números");
		int primeiro = dados.nextInt();
		int segundo = dados.nextInt();
		
		if(primeiro > segundo) {
			System.out.println(primeiro + "é o maior!");
	 }else {
			 System.out.println(segundo + " é o maior!");
	}
	}
}
