package edu.afrain;

public class TiposVariaveis {

	public static void main(String[] args) {
		
		// TIPOS PRIMITIVOS	
		
		double salarioMinimo = 2500;
		System.out.println(salarioMinimo);
		
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		numeroCurto = (short) numeroNormal;
		
		// CONSTANT
		
		final double VALOR_DE_PI = 3.14;
		System.out.println(VALOR_DE_PI);
		
		
	}

}
