package com.unaj.lescano.tp1.ej3;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraDeMatrices {

	Numero valor[][];

////	List<List<Numero>> matriz;
//
//	public CalculadoraDeMatrices(Integer fila, Integer columna) {
//
//		this.valor = new Numero[fila][columna];
//
////		this.buildMatriz(fila, columna);
//
//	}

	public CalculadoraDeMatrices(Numero[][] matriz) {
		this.valor = matriz;
	}

	public CalculadoraDeMatrices suma(Numero[][] matriz) {

		try {
			if (!this.validate(matriz))
				throw new Exception("La operacion no es posible Orden distinto");

			for (int i = 0; i < this.valor.length; i++) {
				for (int j = 0; j < this.valor[i].length; j++) {
					this.valor[i][j].sumar(matriz[i][j]);
				}
			}
		} catch (Exception e) {
		}
		return this;

	}

	public CalculadoraDeMatrices restar(Numero[][] matriz) {

		try {
			if (!this.validate(matriz))
				throw new Exception("La operacion no es posible Orden distinto");

			for (int i = 0; i < this.valor.length; i++) {
				for (int j = 0; j < this.valor[i].length; j++) {
					this.valor[i][j].sumar(matriz[i][j]);
				}
			}
		} catch (Exception e) {
		}
		return this;

	}

	public Numero traza(Numero num) {
		try {
			if (!this.isSquared())
				throw new Exception("La operacion no es posible la matriz no es cuadrada");

			for (int i = 0; i < this.valor.length; i++) {

				for (int j = 0; j < this.valor[i].length; j++) {
					if (i == j)
						num.sumar(this.valor[i][j]);
				}
			}
		} catch (Exception e) {
		}
		return num;
	}

//	public Numero determinante(Numero num) {
//
//		try {
//			if (!this.isSquared())
//				throw new Exception("La operacion no es posible la matriz no es cuadrada");
//
//			for (int i = 0; i < this.matriz.size(); i++) {
//
//				for (int j = 0; j < this.matriz.get(i).size(); j++) {
//					if (i == j)
//						num.sumar(this.getMatriz().get(i).get(j));
//				}
//			}
//
//		} catch (Exception e) {
//		}
//		return num;
//	}

	private Boolean validate(Numero[][] matriz) {

		if (matriz.length == this.valor.length && matriz[0].length == this.valor[0].length)
			return true;

		return false;
	}

	private Boolean isSquared() {
		if (this.valor.length == this.valor[0].length)
			return true;

		return false;
	}

	public Numero[][] getValor() {
		return valor;
	}

	public void setValor(Numero[][] valor) {
		this.valor = valor;
	}

//	public List<List<Numero>> getMatriz() {
//		return matriz;
//	}
//
//	public void setMatriz(List<List<Numero>> matriz) {
//		this.matriz = matriz;
//	}

//	public Integer Determinante(int i, List<List<NumeroEntero>> matris) {
//
////	      if (matriz.length==2) 
////	      {
////	    	  Integer deter=matriz[0][0]*matriz[1][1]-matriz[0][1]*matriz[1][0];       
////	        
////	        return  deter;
////	      }
//
////	      else
////	      {
//		Integer deter = 0;
//
//		for (int j = 0; j < matris.size(); j++) {
//			NumeroEntero numero = (NumeroEntero) matris.get(i).get(j);
//			List<List<NumeroEntero>> temp = this.SubMatriz(i, j, matris);
//
//			deter = (int) (deter + Math.pow(-1, i + j) * numero.getValor() * this.Determinante(0, temp));
//
//		}
//
//		return deter;
////	      }
//
//	}
//
//	// claculo de submatriz eliminado i, j
//
//	private List<List<NumeroEntero>> SubMatriz(int i, int j, List<List<NumeroEntero>> matriz) {
//		new ArrayList<List<NumeroEntero>>();
//		List<List<NumeroEntero>>  temp = new ArrayList<List<NumeroEntero>>(); new double[matriz.length - 1][matriz.length - 1];
//
//		int count1 = 0;
//		int count2 = 0;
//
//		for (int k = 0; k < matriz.length; k++) {
//			if (k != i) {
//				count2 = 0;
//				for (int l = 0; l < matriz.length; l++) {
//					if (l != j) {
//						temp[count1][count2] = matriz[k][l];
//
//						count2++;
//					}
//
//				}
//
//				count1++;
//			}
//
//		}
//
//		return temp;
//
//	}

}
