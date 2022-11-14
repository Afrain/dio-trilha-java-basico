package edu.afrain.modelo;

public class SmartTV {
	
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	public void ligar() {
		this.ligada = true;
	}
	
	public void desligar() {
		this.ligada = false;
	}
	
	public void aumentarVolume() {
		this.volume++;
	}
	
	public void diminuirVolume() {
		this.volume--;
	}
	
	public void canalProximo() {
		this.canal++;
	}
	
	public void canalAnterior() {
		this.canal--;
	}
	
	public void canalDefinir(int canal) {
		this.canal = canal;
	}
	
}
