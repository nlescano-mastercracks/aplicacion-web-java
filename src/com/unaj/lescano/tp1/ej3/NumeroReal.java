package com.unaj.lescano.tp1.ej3;

public class NumeroReal  extends Numero  {
	
	private Double valor;


	public NumeroReal(Double valor) {
		super();
		this.valor = valor;
	}

	@Override
	public Numero sumar(Numero n) {
		Double valorSum = ((NumeroReal) n).getValor(); 
		this.setValor(this.getValor() + valorSum);

		return this;
	}

	@Override
	public Numero resta(Numero n) {
		Double valorSum = ((NumeroReal) n).getValor(); 
		this.setValor(this.getValor() - valorSum);		
		return this;
	}

	@Override
	public Numero multliplicarPor(Numero n) {
		Double valorSum = ((NumeroReal) n).getValor(); 
		this.setValor(this.getValor() * valorSum);	
		return this;
	}

	@Override
	public Numero dividirPor(Numero n) {
		Double valorSum = ((NumeroReal) n).getValor(); 
		this.setValor(this.getValor() / valorSum);	
		return this;
	}

	@Override
	public String toString() {
		return "El valor es " + this.valor;

	}
	
	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}


}
