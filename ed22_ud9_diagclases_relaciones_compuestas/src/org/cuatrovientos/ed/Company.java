package org.cuatrovientos.ed;

import java.util.ArrayList;

public class Company {
	
	//Customer[] customers = new Customer[10]
		ArrayList<Customer> customers = new ArrayList<Customer>();
		ArrayList<Employee> employeers = new ArrayList<Employee>();
		
		//Funcion para contratar un empleado
		public boolean hire(Employee emp) {
			return this.employeers.add(emp);
		}
		
		//Funcion para despedir a un empleado
		public boolean fire(Employee emp) {
			return this.employeers.remove(emp);
		}
		
		//Obtener valores de un empleado en concreto
		public Employee getInfo(int index) {
			return this.employeers.get(index);
}
}