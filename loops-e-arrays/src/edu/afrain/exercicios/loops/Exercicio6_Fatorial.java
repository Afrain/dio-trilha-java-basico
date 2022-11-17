package edu.afrain.exercicios.loops;

import java.util.Scanner;

/*
 * Faça um programa que calcule o fatorial de um número inteiro
 * fornecido pelo usuário.
 * Ex.: 5! = 120
 */
public class Exercicio6_Fatorial {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		double fatorial = 1;
		
		System.out.println("Informe um número: ");
		numero = scanner.nextInt();
		
		for(int i = numero; i > 0 ; i--) {
			System.out.println(numero);
			fatorial *= i;
		}
		
		System.out.println("Fotorial é: " + fatorial);
		
		scanner.close();
	}
	
}
