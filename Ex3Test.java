package org.itacademy.javatesting.assertj;


//import org.junit.jupiter.api.Assertions;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

//import org.junit.jupiter.api.Test;

class Ex3Test {

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void comprobarMetodo() {
		Ex3 e1=new Ex3();
		e1.metodo1();
		
	}
}
