package com.unaj.javaweb.lescano;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "libro")
public class Libro {

	@Id
	@GeneratedValue
	private Long id;
	private String isbn;
	private String autor;
	private String titulo;
	private Integer valor;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Libro() {
		super();
	}
	public Libro(String isbn, String autor, String titulo, Integer valor) {
		super();
		this.isbn = isbn;
		this.autor = autor;
		this.titulo = titulo;
		this.valor = valor;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
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
	@Override
	public String toString() {
		String libro ="Isbc: " + this.isbn + " Autor: "+this.autor+" Titulo: "+this.titulo+" Valor: " +this.valor;
		return libro ;
	}
	
	
	
}
