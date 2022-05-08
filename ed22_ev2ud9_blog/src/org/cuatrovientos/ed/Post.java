package org.cuatrovientos.ed;

public class Post {

	private String titulo;
	private String contenido;

	
	public Post() {
		
	}

	public String showPost() {
		return this.titulo;
	}
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
}
