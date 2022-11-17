package edu.afrain.exercicios.arrays;

import java.util.Random;

/*
 * Gere e imprima uma matriz M 4 X 4 com valores aleatórios
 * entre 0-9.
 */
public class Exercicio4_ArrayMultidimensional {

	public static void main(String[] args) {

		Random random = new Random();
		
		int[][] m = new int[4][4];
		
		for (int linha = 0; linha < m.length; linha++) {
			for (int coluna = 0; coluna < m[linha].length; coluna++) {
				m[linha][coluna] = random.nextInt(9);
			}
		}
		
		System.out.println("Matriz: ");
		for (int[] linha : m) {
			for (int coluna : linha) {
				System.out.print(coluna + " ");
			}
			System.out.println();
		}

	}

}
