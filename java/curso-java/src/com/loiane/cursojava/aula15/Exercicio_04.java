package com.loiane.cursojava.aula15;

import java.util.Scanner;
public class Exercicio_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a letra para verificar se � Vogal ou Consoante");
		char letra = scan.next().charAt(0);
		switch(letra) {
		case 'A':
		case 'a':
		case 'E':
		case 'e':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println("� uma vogal!"); break;
		
		default:
			System.out.println("� uma consoante, n�mero ou simbolo");
			
		}
	}

}
