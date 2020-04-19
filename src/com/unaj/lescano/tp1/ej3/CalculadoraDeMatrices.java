package com.unaj.lescano.tp1.ej3;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraDeMatrices {

	Numero valor[][];

	List<List<Numero>> matriz;

	public CalculadoraDeMatrices(Integer fila, Integer columna) {

		this.valor = new Numero[fila][columna];

		this.buildMatriz(fila, columna);

	}

	public List<List<Numero>> suma(List<List<Numero>> matriz) {

		List<List<Numero>> matrizFinal = new ArrayList<List<Numero>>();
		
		try {
			if (!this.validate(matriz))
				throw new Exception("La operacion no es posible Orden distinto");

			for (int i = 0; i < this.matriz.size(); i++) {
				List<Numero> auxMatriz2 = matriz.get(i);
				List<Numero> auxMatriz = new ArrayList<Numero>();

				for (int j = 0; j < this.matriz.get(i).size(); j++) {
					Numero numMatriz2 = auxMatriz2.get(j);
					Numero numMatriz1 = this.matriz.get(i).get(j);
					auxMatriz.add(numMatriz1.sumar(numMatriz2));
				}
				matrizFinal.add(auxMatriz);
			}
		} catch (Exception e) {
		}
		return matrizFinal;

	}

	public List<List<Numero>> restar(List<List<Numero>> matriz) {

		List<List<Numero>> matrizFinal = new ArrayList<List<Numero>>();
		
		try {
			if (!this.validate(matriz))
				throw new Exception("La operacion no es posible Orden distinto");

			for (int i = 0; i < this.matriz.size(); i++) {
				List<Numero> auxMatriz2 = matriz.get(i);
				List<Numero> auxMatriz = new ArrayList<Numero>();

				for (int j = 0; j < this.matriz.get(i).size(); j++) {
					Numero numMatriz2 = auxMatriz2.get(j);
					Numero numMatriz1 = this.matriz.get(i).get(j);
					auxMatriz.add(numMatriz1.resta(numMatriz2));
				}
				matrizFinal.add(auxMatriz);
			}
		} catch (Exception e) {
		}
		return matrizFinal;

	}

	public Numero traza(Numero num) {

		for (int i = 0; i < this.matriz.size(); i++) {

			for (int j = 0; j < this.matriz.get(i).size(); j++) {
				if (i == j)
					num.sumar(this.getMatriz().get(i).get(j));
			}
		}
		return num;
	}
	
	public Numero determinante(Numero num) {

		for (int i = 0; i < this.matriz.size(); i++) {

			for (int j = 0; j < this.matriz.get(i).size(); j++) {
				if (i == j)
					num.sumar(this.getMatriz().get(i).get(j));
			}
		}
		return num;
	}
	
	
	
	

	private Boolean validate(List<List<Numero>> matriz) {

		List<Numero> column1 = matriz.get(0);
		List<Numero> column2 = this.getMatriz().get(0);
		if (matriz.size() == this.getMatriz().size() && column1.size() == column2.size())
			return true;

		return false;
	}

	private void buildMatriz(Integer fila, Integer columna) {
		this.matriz = new ArrayList<List<Numero>>();
		for (Integer i = 0; i <= columna; i++) {
			this.addElement(matriz, fila);
		}
	}

	public void addElement(List<List<Numero>> matriz, Integer fila) {
		List list = new ArrayList<Number>();
		for (int i = 0; i < fila; i++) {
			list.add(new NumeroEntero(1));
		}
		matriz.add(list);
	}

	public Numero[][] getValor() {
		return valor;
	}

	public void setValor(Numero[][] valor) {
		this.valor = valor;
	}

	public List<List<Numero>> getMatriz() {
		return matriz;
	}

	public void setMatriz(List<List<Numero>> matriz) {
		this.matriz = matriz;
	}
}
