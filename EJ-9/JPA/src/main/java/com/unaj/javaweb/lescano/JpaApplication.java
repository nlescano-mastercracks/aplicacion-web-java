package com.unaj.javaweb.lescano;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class JpaApplication  implements CommandLineRunner {

	@Autowired
	private LibroService lService;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Libro> listLibro = Arrays.asList(
				new Libro("222-222-333","Autor 1.","Titulo del Libro 1",100),
				new Libro("111-444-777","Autor 2 ","Titulo del Libro 2",200),
				new Libro("333-666-999","Autor 3 ","Titulo del Libro 3",300)
		);
		listLibro.forEach( l -> {
			lService.guardar(l);
		});
		
		List<Libro> libros = new ArrayList<>();
		lService.verLibros().forEach(System.out::println);		
	}


}
