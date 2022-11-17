package edu.afrain.exercicios.loops;

import java.util.Scanner;

/*
 * Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de números pares
 * e a quantidade de números impares.
 */
public class Exercicio4_ParEImpar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int quantidadeNumero, numero, quantidadePares = 0, quantidadeImpares = 0;

		System.out.println("Quantos números deseja informar ?");
		quantidadeNumero = scanner.nextInt();

		int count = 0;

		do {
			System.out.println("Informe o número: ");
			numero = scanner.nextInt();

			if (numero % 2 == 0)
				quantidadePares++;
			else
				quantidadeImpares++;

			count++;
		} while (count < quantidadeNumero);

		System.out.println("Quantidade de números pares: " + quantidadePares);
		System.out.println("Quantidade de números impares: " + quantidadeImpares);

		scanner.close();
	}

}
