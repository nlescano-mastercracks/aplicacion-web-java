package com.unaj.lescano.tp1.ej3;

public class NumeroComplejo extends Numero {

	Double img;

	public NumeroComplejo(Double valor, Double imag) {
		this.num = valor;
		this.img = imag;
	}

	@Override
	public Numero sumar(Numero n) {

		if (n instanceof NumeroComplejo) {
			Double numImg = ((NumeroComplejo) n).img;
			this.setImg(this.img + numImg);
		}
		this.setNum(this.num + n.getNum());
		return this;
	}

	@Override
	public Numero resta(Numero n) {
		
		if (n instanceof NumeroComplejo) {
			Double numImg = ((NumeroComplejo) n).img;
			this.setImg(this.img - numImg);
		}
		this.setNum(this.num - n.getNum());
		return this;
	}

	@Override
	public Numero multliplicarPor(Numero n) {
		if(n instanceof NumeroComplejo ) {
			Double numImg=((NumeroComplejo)n).img;
			this.setImg(this.img*numImg);
		}	
		this.setNum(this.num*n.getNum());
		return this;
	}

	public void setImg(Double img) {
		this.img = img;
	}

	@Override
	public Numero dividirPor(Numero n) {
		if(n instanceof NumeroComplejo ) {
			Double numImg=((NumeroComplejo)n).img;
			this.setImg(this.img*numImg);
		}	
		this.setNum(this.num*n.getNum());
		return this;
	}

	@Override
	public String toString() {
		return "El valor es Real: " + this.num +" El valor imaginario es:"+this.img;

	}

}
