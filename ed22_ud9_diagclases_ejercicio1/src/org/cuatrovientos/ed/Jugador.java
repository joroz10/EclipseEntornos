package org.cuatrovientos.ed;

public class Jugador {

	private Dado d = new Dado(6);
	
	public int tirarDado() {
		return d.numCaras;
	}
}
	