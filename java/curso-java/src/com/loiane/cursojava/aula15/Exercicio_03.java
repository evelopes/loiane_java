package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o sexo da pessoa:");
		String sexo = entrada.nextLine();
		char primeiraLetra = sexo.charAt(0);
		
		//no if char se compara com char
		if(primeiraLetra == 'f' || primeiraLetra == 'F') {
			System.out.println("Sexo feminino");
		}else if(primeiraLetra == 'm' || primeiraLetra == 'M') {
			System.out.println("Sexo masculino");
		}else {
			System.out.println("Não binário ou sexo inválido");
		}
		
		;


}
}
