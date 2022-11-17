package edu.afrain.exercicios.loops;

import java.util.Scanner;

/*
 * fa�a um programa que leia 5 n�meros e 
 * informe o maior numero e a m�dia desses n�meros.
 */
public class Exercicio3_MaiorMedia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero;
		int count = 0;
		int soma = 0;
		int maiorNumero = 0;

		do {

			System.out.println("Informe o n�mero: ");
			numero = scanner.nextInt();
			soma += numero;
			count++;

			if (numero > maiorNumero)
				maiorNumero = numero;

		} while (count < 5);

		System.out.println("M�dia: " + (soma / count));
		System.out.println("Maior n�mero: " + maiorNumero);
		
		scanner.close();
	}

}
