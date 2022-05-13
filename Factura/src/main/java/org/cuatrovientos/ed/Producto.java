package org.cuatrovientos.ed;

public class Producto {

	private String nombre;
	private float precio;
	private int cantidad;
	public Producto(String nombre, float precio, int cantidad) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}	
	
	public float precioTotal() {
		float coste;
		coste = this.precio*this.cantidad;
		return coste;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nPrecio: " + precio + "\nCantidad: " + cantidad + "\nCoste total: " + precioTotal();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}