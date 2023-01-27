package com.loiane.cursojava.aula13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		//Faça um programa que converta metros para centimetros
		
		DecimalFormat df = new DecimalFormat("#."); //#.00 poderia ser utilizado
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor em metros:");
		double metro = entrada.nextDouble();
		double centimetros = metro * 100;
		System.out.println(metro + " tem " + df.format(centimetros) + " centimetros");
		
	}

}
