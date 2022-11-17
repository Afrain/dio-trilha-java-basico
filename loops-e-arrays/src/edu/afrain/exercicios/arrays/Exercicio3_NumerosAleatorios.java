package edu.afrain.exercicios.arrays;

import java.util.Random;

/*
 * Fa�a um programa que leia 20 n�meros inteiros
 * aleat�rios (entre 0 e 100) armazene-os eu um vetor.
 * Ao final mostre os n�meros e seus sucessores.
 */
public class Exercicio3_NumerosAleatorios {

	public static void main(String[] args) {

		Random random = new Random();
		
		int[] numerosAleatorios = new int[20];
		
		for (int i = 0; i < numerosAleatorios.length; i++) {
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;
		}
		
		System.out.print("\nN�meros Aleat�rios: ");
		for (int numero : numerosAleatorios) {
			System.out.print(numero + " ");
		}
		
		System.out.print("\nN�meros Sucessores: ");
		for (int numero : numerosAleatorios) {
			System.out.print((numero + 1) + " ");
		}

	}

}
