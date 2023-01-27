package com.loiane.cursojava.aula13;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		//Fa�a um programa que pe�a o raio, e calcule a �rea do circulo

		DecimalFormat df = new DecimalFormat("#.0"); 	
		
		//calculo �rea de um circulo: pi*r�
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o raio do circulo:");
		double raio = entrada.nextDouble();
		double area = Math.PI *(raio * raio);
		System.out.println("Area do circulo:" + df.format(area));
		
		
	}
}
