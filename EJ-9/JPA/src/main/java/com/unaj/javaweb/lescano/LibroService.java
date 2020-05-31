package com.unaj.javaweb.lescano;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class LibroService {

	@Autowired
	LibroRepository libroRepo;
	
	public void guardar (Libro l) {
		libroRepo.save(l);
	}
	
	public List<Libro> verLibros(){
		List<Libro> libros = new ArrayList<>();
		libroRepo.findAll().forEach(l -> libros.add(l));
		return libros;
	}
}
