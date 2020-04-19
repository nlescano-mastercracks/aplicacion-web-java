package com.unaj.lescano.tp1.ej3;

public class NumeroEntero extends Numero {

	private Integer valor;

	public NumeroEntero(Integer valor) {

		this.valor = valor;

	}

	@Override
	public Numero sumar(Numero n) {
		Integer valor2 = ((NumeroEntero) n).getValor();
		this.setValor(this.getValor()+valor2);
		return this;
	}



	@Override
	public Numero resta(Numero n) {
		Integer valor2 = ((NumeroEntero) n).getValor();
		this.setValor(this.getValor()-valor2);
		return this;
	}

	@Override
	public Numero multliplicarPor(Numero n) {
		Integer valor2 = ((NumeroEntero) n).getValor();
		this.setValor(this.getValor()-valor2);
		return this;
	}

	@Override
	public Numero dividirPor(Numero n) {
		// TODO Auto-generated method stub
		return null;
	}
	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}
}
