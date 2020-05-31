package com.unaj.lescano.tp1;

import java.util.List;

import com.unaj.lescano.tp1.ej3.CalculadoraDeMatrices;
import com.unaj.lescano.tp1.ej3.Numero;
import com.unaj.lescano.tp1.ej3.NumeroEntero;

public class Prueba {

	public static void main(String[] args) {

//		NumeroEntero valor1 = new NumeroEntero(3);
////		NumeroEntero valor2 = new NumeroEntero(3);
////
////		System.out.println(valor1.getValor());
////
////		valor1.sumar(valor2);
////		
////		System.out.println(valor1.getValor());
//
//		CalculadoraDeMatrices matriz = new CalculadoraDeMatrices(3, 4);
//
//		CalculadoraDeMatrices matriz2 = new CalculadoraDeMatrices(3, 4);
//
//		List<List<Numero>> m =matriz.getMatriz();
//		
//		List<List<Numero>> m2=	matriz.suma(matriz2.getMatriz());
//		
//		for (int i = 0; i < m2.size(); i++) {
//			System.out.println("corte");
//			for (int j = 0; j < m2.get(i).size(); j++) {
//			NumeroEntero miNumero =	(NumeroEntero) m2.get(i).get(j);
//			System.out.println(miNumero.getValor());
//			}
//		}
////		int cont = 1;
////		for (int i = 0; i <= m.size()-1; i++) {
////			
////			 System.out.println("Columna: "+ cont);
////			 for (int j = 0; j <m.get(i).size()-1; j++) {
////				 NumeroEntero n = (NumeroEntero) m.get(i).get(j);
////				 System.out.println("elemento :"+n.getValor());
////				
////			}
////			 cont++;
////		}
//////	 System.out.println("Columna: "+ cont);
//////	 System.out.println("Columna: "+ cont);

		Integer valor[][] = new Integer[3][3];

		double[][] matriz = { { 1, -3, 2, 4, 6 }, { 2, 5, 4, 1 }, { 0, -1, 8, -2 }, { 3, -1, -4, -2 } };

		System.out.println(matriz.length);
		System.out.println(matriz[0].length);
	}
}
