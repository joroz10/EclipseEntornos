package org.cuatrovientos.ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FacturaTest {

	Factura fac = new Factura();
	Producto pr0;
	Producto pr1;
	Producto pr2;
	
	@BeforeEach
	void setUp() throws Exception {
		this.pr0 = new Producto("Patata", 5, 3);
		this.pr1 = new Producto("Tomate", 2, 6);
		this.pr2 = new Producto("Piña", 6, 1);
		
	}

	@Test
	void ProductoTest() {
		assertEquals(pr0.getPrecio() * pr0.getCantidad(), pr0.precioTotal(), 0.2);
		boolean samename = false;
		if (pr0.getNombre() == "Patata") {
			samename = true;
		} else {
			samename = false;
		}
		assertTrue(samename);
	}

	@Test
	void FacturaTest() {
		fac.añadirProducto(pr0);
		fac.añadirProducto(pr1);
		fac.añadirProducto(pr2);
		float total = 0;
		total = total + pr0.precioTotal();
		total = total + pr1.precioTotal();
		total = total + pr2.precioTotal();
		assertEquals(fac.precioTotal(), total, 0.2);
		assertEquals(fac.aplicarIva(), total*1.21, 0.2);
		
	}

}
