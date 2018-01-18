import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void calcularAreaTest() {
		int area = Calculadora.CalcularAreaCuadrado(11);
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
	public void mismoColorCocheTest(){
		Coche audi = new Coche();
		audi.setColor("rojo");
		Coche bmw = new Coche();
		bmw.setColor("rojo");
		
		assertSame(audi.getColor(),bmw.getColor());
		
	}
	
	@Test
	public void numPlazasDiferentesTest(){
		Coche audi = new Coche();
		audi.setNum_plazas(5);
		Coche bmw = new Coche();
		bmw.setNum_plazas(7);
		
		assertNotSame(audi.getNum_plazas(), bmw.getNum_plazas());
	}

}
