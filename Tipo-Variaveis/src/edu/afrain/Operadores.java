package edu.afrain;

public class Operadores {

	public static void main(String[] args) {
		int numero = 5;
		
		// numero = numero + 1;
		numero++;
		System.out.println(numero);
		
		boolean variavel = true;
		variavel = !variavel;
		System.out.println(variavel);
		
		String resultado = "";
		int a = 5;
		int b = 6;
		
		// UTILIZANDO IF/ELSE
		if(a==b)
			resultado = "verdadeiro";
		else
			resultado = "falso";
		
		System.out.println(resultado);
		
		// UTILIZANDO OPERADOR TERNÁRIO
		
		resultado = a==b ? "verdadeiro" : "falso";
		System.out.println(resultado);
		
		// OPERADORES RELACIONAIS
		
		int numero1 = 1;
		int numero2 = 2;
		
		boolean simNao = numero1 == numero2;
		
		System.out.println("Número 1 é igual ao número 2 ? " + simNao);
		
		simNao = numero1 != numero2;
		
		System.out.println("Número 1 é diferente do número 2 ? " + simNao);
		
		simNao = numero1 > numero2;
		
		System.out.println("Número 1 é maior que o número 2 ? " + simNao);
		
		simNao = numero1 < numero2;
		
		System.out.println("Número 1 é menor que o número 2 ? " + simNao);
		
		// OPERADORES LÓGICOS
		
		boolean condicao1 = true;
		boolean condicao2 = false;
		
		if(condicao1 && condicao2 == true) 
			System.out.println("As duas condições são verdadeiras!");
		
		if(condicao1 || condicao2 == true) 
			System.out.println("Uma das condições são verdadeiras!");
		
	}

}
