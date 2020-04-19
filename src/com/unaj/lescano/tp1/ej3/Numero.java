package com.unaj.lescano.tp1.ej3;

public abstract class Numero {

	protected Object valor;
	public abstract Numero sumar(Numero n);

	public abstract Numero resta(Numero n);

	public abstract Numero multliplicarPor(Numero n);

	public abstract Numero dividirPor(Numero n);
}
