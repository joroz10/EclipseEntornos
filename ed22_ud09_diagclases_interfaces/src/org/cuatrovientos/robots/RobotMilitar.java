package org.cuatrovientos.robots;

public class RobotMilitar extends Robot implements ICaminable, IDisparable{

	@Override
	public void disparar() {
		System.out.println("Ratatatata");
		
	}

	@Override
	public void caminar() {
		System.out.println("Rush rush rush");
		
	}

}
