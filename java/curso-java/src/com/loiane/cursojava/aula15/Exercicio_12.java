package com.loiane.cursojava.aula15;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe quantas horas de trabalho por mês");
		double horas = scan.nextDouble();
		System.out.println("Informe quanto ganha por hora");
		double salarioPorHora = scan.nextDouble();
		double salarioBruto = horas * salarioPorHora;
		
		double ir = salarioBruto * 0.05;
		double inss = salarioBruto * 0.10;
		double fgts = salarioBruto * 0.11;
		double descontos = inss + ir;
		double salarioLiquido = salarioBruto - descontos;
		
		String primeiro = String.format("Salário Bruto: (%.2f * %.2f) : R$%.2f", horas, salarioPorHora, salarioBruto);
		String segundo  = String.format("(-)IR                        : R$%.2f", ir);
		String terceiro = String.format("(-)INSS                      : R$%.2f",inss);
		String quarto   = String.format("FGTS                         : R$%.2f",fgts);
		String quinto   = String.format("Total de descontos           : R$%.2f",descontos);
		String sexto    = String.format("Salário liquido              : R$%.2f",salarioLiquido);

		System.out.println(primeiro);
		System.out.println(segundo);
		System.out.println(terceiro);
		System.out.println(quarto);
		System.out.println(quinto);
		System.out.println(sexto);

		
	}
}
