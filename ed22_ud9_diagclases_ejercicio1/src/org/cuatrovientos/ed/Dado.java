package org.cuatrovientos.ed;

import java.util.Random;

public class Dado {
	int numCaras = 6;
	int[] caras= new int[numCaras];
	private Random rnd = new Random();
	
	public Dado(int numCaras) {		
		}
	public void getCaras(int numCaras) {
		this.numCaras = numCaras;
		for (int i = 0; i < caras.length; i++) {
			caras[i]=i+1;
		}
	}
	
}

