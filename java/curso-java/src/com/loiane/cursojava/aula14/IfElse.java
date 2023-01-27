package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*System.out.println("Entre com sua idade");
		int idade = scan.nextInt();
		if(idade >=18) {
			System.out.println("É maior de idade");
		}else {
			System.out.println("É menor de idade");
		}
		*/
		
		
		/* barato <= 10
		 * pedir desconto 10 < valor < 15
		 * pesquisar mais 15<= valor < 17
		 * muito caro >= 17
		 */
		
		System.out.println("Informe o valor do produto");
		double valor = scan.nextDouble();
		if(valor <= 10){
			System.out.println("Está barato");
		}else if(valor > 10 && valor < 15) {
			System.out.println("Peça desconto!");
		}else if(valor >= 15 && valor < 17) {
			System.out.println("Pesquise mais!");
		}else {
			System.out.println("Muito caro!");			
		}
		
		
		
		
	}
}
