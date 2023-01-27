package com.loiane.cursojava.aula13;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		//Faça um programa que peça o raio, e calcule a área do circulo

		DecimalFormat df = new DecimalFormat("#.0"); 	
		
		//calculo área de um circulo: pi*r²
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o raio do circulo:");
		double raio = entrada.nextDouble();
		double area = Math.PI *(raio * raio);
		System.out.println("Area do circulo:" + df.format(area));
		
		
	}
}
