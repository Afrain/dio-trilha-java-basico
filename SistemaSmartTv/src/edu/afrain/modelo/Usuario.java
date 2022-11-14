package edu.afrain.modelo;

public class Usuario {

	public static void main(String[] args) {

		SmartTV smartTV = new SmartTV();

		System.out.println("Está ligada ? " + smartTV.ligada);
		System.out.println("Canal atual: " + smartTV.canal);
		System.out.println("Volume atual: " + smartTV.volume);
		System.out.println();
		
		smartTV.ligar();
		smartTV.aumentarVolume();
		
		System.out.println("Está ligada ? " + smartTV.ligada);
		System.out.println("Canal atual: " + smartTV.canal);
		System.out.println("Volume atual: " + smartTV.volume);
		System.out.println();
		
		smartTV.diminuirVolume();
		smartTV.canalProximo();
		
		System.out.println("Está ligada ? " + smartTV.ligada);
		System.out.println("Canal atual: " + smartTV.canal);
		System.out.println("Volume atual: " + smartTV.volume);
		System.out.println();
		
		smartTV.canalDefinir(47);
		
		System.out.println("Está ligada ? " + smartTV.ligada);
		System.out.println("Canal atual: " + smartTV.canal);
		System.out.println("Volume atual: " + smartTV.volume);
		System.out.println();

	}

}
