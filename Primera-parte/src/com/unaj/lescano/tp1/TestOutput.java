package com.unaj.lescano.tp1;

import com.unaj.lescano.tp1.ej1.Child;
import com.unaj.lescano.tp1.ej1.Parent;

public class TestOutput {

	public static void main(String[] args) {

		Parent ob1 =new  Child();
		Child ob2 = new Child();
		
		ob1.foo();
		ob2.foo();
		System.out.println("------------------------------");
		ob1.bar();
		ob2.bar();
		System.out.println("------------------------------");

		
		Parent.foo();
		Child.foo();
	}
}
