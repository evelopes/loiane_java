package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um numero do dia da semana");
		int diaSemana = entrada.nextInt();
		
		switch(diaSemana) {
		case 1: System.out.println("Domingo");break;
		case 2: System.out.println("Segunda");break;
		case 3: System.out.println("Terça");break;
		case 4: System.out.println("Quarta");break;
		case 5: System.out.println("Quinta");break;
		case 6: System.out.println("Sexta");break;
		case 7: System.out.println("Sábado");	break;
		default: System.out.println("Dia inválido");
		}
		
		switch(diaSemana) {
		case 2: 
		case 3: 
		case 4: 
		case 5:
		case 6: System.out.println("dia útil");break;
		case 1: 
		case 7: System.out.println("Fim de semana");	break;
		default: System.out.println("Não é um dia de semana válido");
		
		
		
	}
	}
}
