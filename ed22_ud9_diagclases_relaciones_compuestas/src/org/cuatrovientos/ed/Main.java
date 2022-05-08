package org.cuatrovientos.ed;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Company cuatrovientos = new Company();
		int opcion;
		do {
			//Menú de opciones
			System.out.println("----- App Empresa");
			System.out.println("1. Contratar un empleado");
			System.out.println("2. Despedir un empleado");
			System.out.println("3. Obtener información de un empleado");
			Scanner miscan = new Scanner(System.in);
			 opcion = Integer.parseInt(miscan.nextLine());
			
			//Máquina de estados
			switch (opcion) {
			case 1:
				Employee emp1 = new Employee();
				cuatrovientos.hire(emp1);
				break;
			case 2:
				Employee emp2 = new Employee();
				cuatrovientos.hire(emp2);
				break;
			case 3:
				System.out.println("Introduce indice");
				int Index = Integer.parseInt(miscan.nextLine());
				Employee emp3 = cuatrovientos.getInfo(opcion);
				break;
			default:
				break;
		}
		}while (opcion != 0);
	}
}
		


