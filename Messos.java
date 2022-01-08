package org.itacademy.javatesting.assertj;


import java.util.*;

public class Messos {
	
	List<String> lista=new ArrayList<String>();
	
	public Messos() {
		
		lista.add("Enero");
		lista.add("Febrero");
		lista.add("Marzo");
		lista.add("Abril");
		lista.add("Mayo");
		lista.add("Junio");
		lista.add("Julio");
		lista.add("Agosto");
		lista.add("Septiembre");
		lista.add("Octobre");
		lista.add("Noviembre");
		lista.add("Diciembre");
		
	}
	
	public int getLongitud() {
		return lista.size();
	}
	public String getPosicion(int a) {
		
		return lista.get(a);
	}
	
	
	
	

}
