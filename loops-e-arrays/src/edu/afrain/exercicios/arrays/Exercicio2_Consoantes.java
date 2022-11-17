package edu.afrain.exercicios.arrays;

import java.util.Scanner;

/*
 * Faça um Programa que leia um vetor de 6 caracteres,
 * e diga quantas consoantes foram lidas.
 * Imprima as consoantes.
 */
public class Exercicio2_Consoantes {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String letra;
		String[] consoantes = new String[6];
		int count = 0, quantidadeConsoantes = 0;
		
		do {
			
			System.out.println("Letra: " );
			letra = scanner.nextLine();
			
			if ( !(letra.equalsIgnoreCase("a") |
					letra.equalsIgnoreCase("e") |
					letra.equalsIgnoreCase("i") |
					letra.equalsIgnoreCase("o") |
					letra.equalsIgnoreCase("u")) ) {
				consoantes[count] = letra;
				quantidadeConsoantes++;
			}
			
			count++;
			
		} while (count < consoantes.length);
		
		System.out.print("Consoantes: ");
		for (String consoante : consoantes) {
			if ( consoante != null)
				System.out.print(consoante + " ");
		}
		
		System.out.println();
		System.out.println("Qtd Consoantes: " + quantidadeConsoantes);

		scanner.close();
	}

}
