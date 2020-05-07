package com.unaj.lescano.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		// Ejercicio 1
		List<String> compras = Arrays.asList("azucar", "yerba", "te", "cafe", "fideos");
		compras.forEach(System.out::printf);

		// Ejercicio 2

		Map<String, Libro> catalogo = new HashMap<>();
		dataLibros(catalogo);
		catalogo.forEach((k, v) -> {
			System.out.println("Autor: " + v.getAutor() + " Titulo: " + v.getTitulo() + "Valor: " + v.getValor());
		});

		// Ejercico 3
		Set treSet = new TreeSet<>();
		treSet.add(33783513);
		treSet.add(2587963);
		treSet.add(15484133);
		System.out.println(treSet);
		treSet.forEach((e) -> {
			System.out.println(e);
		});

		// Ejercicio 4
		ArrayList<Thread> clients = new ArrayList<Thread>();

		for (int i = 0; i < 5; i++) {
			clients.add(new Cliente(i));
		}
		for (Thread thread : clients) {
			thread.start();
		}

	}

	private static void dataLibros(Map<String, Libro> catalogo) {
		catalogo.put("0-1236-8521-9", new Libro("Nicolas", "Java anavzado", 100));
		catalogo.put("1-2036-8841-7", new Libro("Cristian", "Java desde cero", 50));
		catalogo.put("8-1286-8547-8", new Libro("Damian", "Git desde cero", 25));

	}
}
