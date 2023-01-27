package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicio_10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o periodo que estamos: (matutino, vespertino, noturno)");
		String periodo = scan.nextLine();
		char sigla = periodo.charAt(0);
		
		if(sigla == 'm' || sigla == 'M') {
			System.out.println("Bom dia!");
		}else if(sigla == 'v' || sigla == 'V') {
			System.out.println("Boa Tarde!");
		}else if(sigla == 'n' || sigla == 'N') {
			System.out.println("Boa Noite!");
		}else {
			System.out.println("Valor inválido!");
		}
	}
}
