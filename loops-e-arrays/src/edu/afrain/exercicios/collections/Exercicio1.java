package edu.afrain.exercicios.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		List<Double> temperaturas = new ArrayList<>();
		int count = 0;
		double soma = 0;

		// RECEBENDO AS 6 TEMPERATURAS E ARMAZENANDO NA LISTA
		while (count < 6) {
			System.out.println("Informe a " + (count + 1) + "º temperatura: ");
			double temperatura = scanner.nextInt();
			temperaturas.add(temperatura);
			soma += temperatura;
			count++;
		}

		System.out.println("\nExibindo todas as temperaturas:");
		temperaturas.forEach(temperatura -> System.out.print(temperatura + " "));

		// CALCULANDO A MÉDIA SEMESTRAL
		double media = soma / temperaturas.size();
		System.out.println("\nMédia semestral: " + media);

		System.out.println("\nMeses com temperatura acima da média:");
		count = 0;
		for (Double temperatura : temperaturas) {
			Double temp = temperatura;
			if (temp > media) {
				switch (count) {
				case 0:
					System.out.println("1 - Janeiro: " + temp);
					break;
				case 1:
					System.out.println("2 - Fevereiro: " + temp);
					break;
				case 2:
					System.out.println("3 - Março: " + temp);
					break;
				case 3:
					System.out.println("4 - Abril: " + temp);
					break;
				case 4:
					System.out.println("5 - Junho: " + temp);
					break;
				case 5:
					System.out.println("6 - Julho: " + temp);
					break;
				default:
					System.out.print("Nenhuma mês foi acima da média!");
					break;
				}
			}
			count++;
		}

		scanner.close();
	}

}
