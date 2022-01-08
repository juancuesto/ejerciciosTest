package org.itacademy.javatesting.assertj;

public class Ex3 {
	
	public void metodo1() {
		int lista[]= {1,2,3,4};
		for(int i=0;i<6;i++){
		if(i>=lista.length) {
			throw new ArrayIndexOutOfBoundsException("Fuera de rango");
		}
		System.out.println(lista[i]);
		}
		
	}

}
