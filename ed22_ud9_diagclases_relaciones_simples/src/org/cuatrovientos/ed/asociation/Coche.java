package org.cuatrovientos.ed.asociation;

public class Coche {

	Motor m;
	Deposito d;
	
	public Coche() {
		m = new Motor();
		d = new Deposito();
	}
}
