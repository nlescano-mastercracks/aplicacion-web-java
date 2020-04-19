package com.unaj.lescano.tp1;

import java.util.List;


import com.unaj.lescano.tp1.ej3.CalculadoraDeMatrices;
import com.unaj.lescano.tp1.ej3.Numero;
import com.unaj.lescano.tp1.ej3.NumeroEntero;

public class Prueba {

	public static void main(String[] args) {

//		NumeroEntero valor1 = new NumeroEntero(3);
//		NumeroEntero valor2 = new NumeroEntero(3);
//
//		System.out.println(valor1.getValor());
//
//		valor1.sumar(valor2);
//		
//		System.out.println(valor1.getValor());

		CalculadoraDeMatrices matriz = new CalculadoraDeMatrices(3, 4);

		CalculadoraDeMatrices matriz2 = new CalculadoraDeMatrices(3, 4);

		List<List<Numero>> m =matriz.getMatriz();
		
		List<List<Numero>> m2=	m.suma(matriz2);
		int cont = 1;
		for (int i = 0; i <= m.size()-1; i++) {
			
			 System.out.println("Columna: "+ cont);
			 for (int j = 0; j <m.get(i).size()-1; j++) {
				 NumeroEntero n = (NumeroEntero) m.get(i).get(j);
				 System.out.println("elemento :"+n.getValor());
				
			}
			 cont++;
		}
	}
}
