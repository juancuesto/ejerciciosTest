package org.itacademy.javatesting.assertj;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import java.util.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainClass {
	
	Messos m=new Messos();
	@Test
	@DisplayName("Comprovar tamaño ArrayList")
	public void CompruebaTamaño() {
		int a=m.getLongitud();
		assertTrue(a==12);	
	}
	@Test
	@DisplayName("Comprovar posicion ArrayList")
	public void ComprobPosicion() {
		assertEquals(m.getPosicion(7),"Agosto");
	}
	
	
}
