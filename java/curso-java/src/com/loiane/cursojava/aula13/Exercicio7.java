package com.loiane.cursojava.aula13;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio7 {
	public static void main(String[] args) {
		//Calcule a �rea de um quadrado, e em seguida mostre o dobro dessa �rea
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("Informe o lado do quadrado");
		float ladoA = input.nextFloat();
		float area = ladoA* ladoA;
		System.out.println("� area do quadrado �: " + df.format(area));
		System.out.println("O dobro dessa �rea �: " + df.format(2 * area));
		
	}
}
