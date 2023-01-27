package com.loiane.cursojava.aula10;

import java.util.Scanner;

/**
 * @author eveli
 *
 */
public class LeituraDAdos {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*System.out.println("Digite seu nome completo:");
		String nome = scan.next();	
		String sobrenome = scan.nextLine(); 
		System.out.println("Seu nome:"  + nome);
		System.out.println("sobrenome:" + sobrenome);
		
		System.out.println("digite sua idade");
		int idade = scan.nextInt();
		System.out.println("sua idade é " +  idade);*/
		
		System.out.println("Digite o seu primeiro nome, idade, filhos, altura e se tem bicho de estimação");
		String nome = scan.nextLine();
		int idade = scan.nextInt();
		byte filhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		System.out.println("você digitou:");
		System.out.println("Nome:" + nome);
		System.out.println("Idade:" + idade);
		System.out.println("Filhos:" + filhos);
		System.out.println("Altura:" + altura);
		System.out.println("Tem bichos: "+ temPet);
		
		
	}

}
