import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void CalcularAreaTest() {
		int area = Calculadora.CalcularArea(11, "Cuadrado");
		int area_esperada = 121;
		assertEquals(area, area_esperada);
	}
	
	@Test
	public void esParTest(){	
		assertTrue(Calculadora.esPar(4));
	}
	
	@Test
	public void esParTest2(){	
		assertFalse(Calculadora.esPar(5));
	}

}
