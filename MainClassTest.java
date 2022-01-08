package org.itacademy.javatesting.assertj;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MainClassTest {
	
	@Parameters
	public static Iterable<Object[]> data(){
		List<Object[]> lista=new ArrayList<>();
		lista.add(new Object[]{46680099,'N'});
		lista.add(new Object[]{51590695,'Q'});
		lista.add(new Object[]{9242016,'H'});
		lista.add(new Object[]{29824096,'L'});
		lista.add(new Object[]{3086736,'K'});
		lista.add(new Object[]{11480392,'B'});
		lista.add(new Object[]{62230828,'G'});
		lista.add(new Object[]{2114494,'N'});
		lista.add(new Object[]{5318306,'Q'});
		lista.add(new Object[]{54613122,'J'});
		
		return lista;
	}
		
	
	LetraDNI l=new LetraDNI();
	private int a;
	private char exp;
	public MainClassTest(int a,char exp) {
		
		this.a=a;
		this.exp=exp;
	}
	
	
	@Test
	@DisplayName("Comprobar metodo get letra")
	public void compruebaLetra() {
		char p=l.getLetra(a);
		assertTrue(p==exp);
	}
	
	
	
	
}
		
	
	