package com.loiane.cursojava.aula13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		/*Pergunte quanto ganha por hora e o numero 
		de horas trabalhadas no m�s. Calcule e mostre 
		o total que ser� recebido */
		
		Scanner pergunta = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("Quanto voc� ganha por hora?");
		float precoHora = pergunta.nextFloat();
		System.out.println("Quantas horas voc� trabalho esse m�s?");
		float horasTrabalhadas = pergunta.nextFloat();
		System.out.printf("Voc� receber�: R$%.2f", (precoHora * horasTrabalhadas));
		
	}

}
