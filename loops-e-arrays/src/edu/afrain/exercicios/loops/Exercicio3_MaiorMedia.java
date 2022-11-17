package edu.afrain.exercicios.loops;

import java.util.Scanner;

/*
 * faça um programa que leia 5 números e 
 * informe o maior numero e a média desses números.
 */
public class Exercicio3_MaiorMedia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero;
		int count = 0;
		int soma = 0;
		int maiorNumero = 0;

		do {

			System.out.println("Informe o número: ");
			numero = scanner.nextInt();
			soma += numero;
			count++;

			if (numero > maiorNumero)
				maiorNumero = numero;

		} while (count < 5);

		System.out.println("Média: " + (soma / count));
		System.out.println("Maior número: " + maiorNumero);
		
		scanner.close();
	}

}
