package edu.afrain.exercicios.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		List<String> respostas = new ArrayList<>();
		int count = 0;
		
		System.out.println("Responda com S para Sim e N para Não.");
		
		System.out.println("Telefonou para a vitima ? ");
		respostas.add(scanner.nextLine());

		System.out.println("Esteve no local do crime ? ");
		respostas.add(scanner.nextLine());

		System.out.println("Mora perto da vitima ? ");
		respostas.add(scanner.nextLine());

		System.out.println("Devia para a vitima ? ");
		respostas.add(scanner.nextLine());

		System.out.println("Já trabalhou com a vitima ? ");
		respostas.add(scanner.nextLine());

		for (String resp : respostas) {
			if (resp.equalsIgnoreCase("S"))
				count++;
		}

		if (count == 2)
			System.out.println("Suspeito!");
		else if (count == 3 || count == 4)
			System.out.println("Cumplice!");
		else if (count == 5)
			System.out.println("Assasina!");
		else
			System.out.println("Inocente!");

		scanner.close();
	}

}
