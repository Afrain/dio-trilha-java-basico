package edu.afrain.exercicios.loops;

import java.util.Scanner;

/*
 * Desenvolva um gerador de tabuada, capaz de gerar
 * a tabuada de qualquer n�mero inteiro entre 1 a 10.
 * O usu�rio deve informar de qual n�mero ele deseja ver a tabuada.
 * A sa�da deve ser conforme o exemplo abaixo:
 * 
 * Tabuada de 5:
 * 5 X 1 = 5
 * 5 X 2 = 10
 * ...
 * 5 X 10 = 50
 */
public class Exercicio5_Tabuada {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero;

		System.out.println("Informe um n�mero de 1 a 10: ");
		numero = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " X " + i + " = " + (numero * i));
		}
		
		scanner.close();
	}
}
