package edu.afrain.exercicios.arrays;
/*
 * Crie um vetor de 6 números inteiros
 * e mostre-os na ordem inversa.
 */
public class Exercicio1_OrdermInversa {

	public static void main(String[] args) {

		int[] vetor = { -5, -8, 5, 7, 1, 3 };
		int count = 0;

		System.out.println("Vetor");
		while (count < vetor.length) {
			System.out.print(vetor[count] + " ");
			count++;
		}

		System.out.println();
		
		System.out.println("Vetor inverso");
		for (int i = (vetor.length - 1); i >= 0; i--) {
			System.out.print(vetor[i] + " ");
		}

	}

}
