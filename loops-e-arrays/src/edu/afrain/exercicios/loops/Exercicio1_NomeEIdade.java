package edu.afrain.exercicios.loops;

import java.util.Scanner;
/*
 * Faça um programa que leia conjuntos de dois valores, 
 * o primeiro representando o nome do aluno e o segundo a sua idade.
 * (Pare o programa inserindo o valor 0 no campo nome)
 */

public class Exercicio1_NomeEIdade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String nome;
		int idade = 0;

		while (true) {
			System.out.println("Nome: ");
			nome = scanner.next();
			if (nome.equals("0"))
				break;

			System.out.println("Idade: ");
			idade = scanner.nextInt();
		}

		System.out.println("Nome: " + nome);
		System.out.println("idade: " + idade);

		scanner.close();
	}
}
