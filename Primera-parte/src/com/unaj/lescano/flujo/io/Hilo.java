package com.unaj.lescano.flujo.io;

public class Hilo extends Thread {

	private String in;
	private String out;
	
	public Hilo(String in, String out) {
		this.in = in;
		this.out = out;
	}
	public String getIn() {
		return in;
	}
	public void setIn(String in) {
		this.in = in;
	}
	public String getOut() {
		return out;
	}
	public void setOut(String out) {
		this.out = out;
	}
}
