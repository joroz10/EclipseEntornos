package org.cuatrovientos.ed;

public class Lista{

	int numProductos = 100;
	Productos[] listaProductos;
	public Lista(int num) {
		this.listaProductos = listaProductos = new Productos[num];
	}
	
	public boolean add(Productos p) {
		if(this.listaProductos[this.listaProductos.length - 1] == null) {
			//La lista no esta llena
			//Agre
			for (int i = 0; i < listaProductos.length; i++) {
				if (this.listaProductos[i] == null) {
					//agregar aqui
					this.listaProductos[i] = p;
					return true;
				}
				
			}
			
		} 
		//La lista está llena, no se puede agregar
		return false;		
		//Si no return false
	}
	
	public String showAll() {
		//TODO Recorrer lista y mostrar elementos
		String result = "";
		for (Productos productos : listaProductos) {
			result += productos.toString() + "/n";
		}
		return result;
	}
	
	
	
}
