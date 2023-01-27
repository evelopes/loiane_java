package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicio_11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o salário");
		
		double novoSalario = 0;
		double percentual = 0;
		double valorAumento = 0;
		double salario = scan.nextDouble();
		
		if(salario >= 280) {
			percentual = 0.2;
			valorAumento = salario * percentual;
			novoSalario = salario + valorAumento;
		}
		if(salario > 280 && salario < 700) {
			percentual = 0.15;
			valorAumento = salario * percentual;
			novoSalario = salario + valorAumento;
		}
		if(salario > 700 && salario < 1500) {
			percentual = 0.10;
			valorAumento = salario * percentual;
			novoSalario = salario + valorAumento;
		}
		if(salario > 1500) {
			percentual = 0.05;
			valorAumento = salario * percentual;
			novoSalario = salario + valorAumento;
		}		
		
		
		System.out.println("Salário antes do ajuste: " +  salario);
		System.out.println("Percentual: " + percentual);
		System.out.println("Valor do Aumento: " +  valorAumento);
		System.out.println("Novo salário: " + novoSalario);
	}
}
