package edu.afrain.exercicios.loops;

import java.util.Scanner;

/*
 * Fa�a um programa que pe�a N n�meros inteiros,
 * calcule e mostre a quantidade de n�meros pares
 * e a quantidade de n�meros impares.
 */
public class Exercicio4_ParEImpar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int quantidadeNumero, numero, quantidadePares = 0, quantidadeImpares = 0;

		System.out.println("Quantos n�meros deseja informar ?");
		quantidadeNumero = scanner.nextInt();

		int count = 0;

		do {
			System.out.println("Informe o n�mero: ");
			numero = scanner.nextInt();

			if (numero % 2 == 0)
				quantidadePares++;
			else
				quantidadeImpares++;

			count++;
		} while (count < quantidadeNumero);

		System.out.println("Quantidade de n�meros pares: " + quantidadePares);
		System.out.println("Quantidade de n�meros impares: " + quantidadeImpares);

		scanner.close();
	}

}
