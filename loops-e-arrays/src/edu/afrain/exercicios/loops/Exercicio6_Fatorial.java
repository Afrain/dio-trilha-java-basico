package edu.afrain.exercicios.loops;

import java.util.Scanner;

/*
 * Fa�a um programa que calcule o fatorial de um n�mero inteiro
 * fornecido pelo usu�rio.
 * Ex.: 5! = 120
 */
public class Exercicio6_Fatorial {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		double fatorial = 1;
		
		System.out.println("Informe um n�mero: ");
		numero = scanner.nextInt();
		
		for(int i = numero; i > 0 ; i--) {
			System.out.println(numero);
			fatorial *= i;
		}
		
		System.out.println("Fotorial �: " + fatorial);
		
		scanner.close();
	}
	
}
