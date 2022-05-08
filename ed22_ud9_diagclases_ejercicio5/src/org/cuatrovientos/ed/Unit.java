package org.cuatrovientos.ed;

public abstract class Unit {

	String name;
	int age;
	int legio;
	
	public void attack() {
		System.out.println("Al ataque");
	}
	public void defend() {
		System.out.println("Cuidado");
	}
}
