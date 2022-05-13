package org.cuatrovientos.ed;

import java.util.ArrayList;

public class Factura {

	private ArrayList<Producto> Productos = new ArrayList<Producto>();
	
	public void añadirProducto(Producto p) {
		Productos.add(p);
	}
	
	public float precioTotal() {
		float total = 0;
		for (int i = 0;i<Productos.size();i++) {
			total = total + Productos.get(i).precioTotal();
		}
		return total;
	}
	
	public float aplicarIva() {
		float total;
		total = (float) (precioTotal()*1.21);
		return total;
	}
}
