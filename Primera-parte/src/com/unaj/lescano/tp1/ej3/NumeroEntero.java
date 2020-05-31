package com.unaj.lescano.tp1.ej3;

public class NumeroEntero extends Numero {


	public NumeroEntero(Double valor) {

		this.num = valor;

	}

	@Override
	public Numero sumar(Numero n) {
		this.setNum(this.getNum() + n.getNum());
		return this;
	}

	@Override
	public Numero resta(Numero n) {
		this.setNum(this.getNum() - n.getNum());
		return this;
	}

	@Override
	public Numero multliplicarPor(Numero n) {
		this.setNum(this.getNum() * n.getNum());
		return this;
	}

	@Override
	public Numero dividirPor(Numero n) {
		Double val = this.getNum() / n.getNum();
		this.setNum(val);
		return this;
	}


	@Override
	public String toString() {
		return "El valor es " + this.num;
	}
}
