import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void calcularAreaTest() {
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

	
	@Test
	public void valorarCocheTest(){
		Coche audi = new Coche();
		audi.setKilometraje(20000);
		audi.setPrecioCompra(100000);
		assertNotNull(audi.valorar());
	}
	
	@Test
	public void nombreActuacionTest(){
		
		Actuacion u2 = new Actuacion();
		
		assertNull(u2.getNombreGrupo());
		
	}
	
	@Test
	public void mismoCocheTest(){
		
	}

}
