package org.cuatrovientos.ed;

public class App {

	public static void main(String[] args) {
		Producto pr = new Producto("Patata", 5, 3);
		System.out.println(pr.toString());
		Factura fc = new Factura();
		fc.añadirProducto(pr);
		Producto pr2 = new Producto("Galletas", 6, 2);
		fc.añadirProducto(pr2);
		System.out.println("");
		System.out.println("Precio total: " + fc.precioTotal());
		System.out.println("Precio total tras aplicar el IVA: " + fc.aplicarIva());
		
		

	}

}
