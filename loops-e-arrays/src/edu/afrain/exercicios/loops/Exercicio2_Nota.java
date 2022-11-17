package edu.afrain.exercicios.loops;

import java.util.Scanner;

/*
 * Fa�a um programa que pe�a uma nota, entre zero e dez.
 * Mostre uma mensagem caso o valor seja inv�lido e 
 * continue pedindo at� que o usu�rio informe um valor v�lido. 
 */
public class Exercicio2_Nota {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int nota;

		System.out.println("Informe a nota: ");
		nota = scanner.nextInt();

		while (nota < 0 || nota > 10) {
			System.out.println("Nota inv�lida! Informe uma Nota v�lida: ");
			nota = scanner.nextInt();
		}

		System.out.println("Nota: " + nota);

		scanner.close();
	}

}
