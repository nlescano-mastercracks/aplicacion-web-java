package com.unaj.lescano.collection;

public class Libro {

	private String autor;
	private String titulo;
	private Integer valor;
	
	
	public Libro(String autor, String titulo, Integer valor) {
		this.autor = autor;
		this.titulo = titulo;
		this.valor = valor;
	}
	

	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}

}
