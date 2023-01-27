package com.loiane.cursojava.aula13;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);
		
		String nome = "Eve";
		String elaE = " estudante de ADS";
		System.out.println(nome + elaE);

		System.out.println(resultado++ + ": resultado++, fez o print depois atribui para " +  resultado); //print depois atribui
		System.out.println(resultado + ": valor de resultado já atribuido da ação anterior"); //valor já atribuido
		System.out.println(++resultado + ": ++resultado, atribuiu depois fez o print do " + resultado); //atribui depois faz o print
		
		
	}
}
