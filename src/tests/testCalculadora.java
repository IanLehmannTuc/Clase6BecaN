package tests;

import static org.junit.jupiter.api.Assertions.*;
import inicio.Calculadora;

import org.junit.jupiter.api.Test;

class testCalculadora {
	
	private Calculadora calculadora;
	
	public testCalculadora() {
		this.calculadora = new Calculadora();
	}

	@Test
	void multiplicar80con30() {
		assertEquals(calculadora.multiplicacion(80, 3), 240);
	}
	
	@Test
	void sumar150con180yDivididorPor3() {
		assertEquals(calculadora.divicion(calculadora.suma(150, 180), 3), 110);
	}
	
	@Test
	void restar90y50yMultiplicadoPor15noDar605() {
		assertNotEquals(calculadora.multiplicacion(calculadora.resta(90, 50), 15), 605);
	}
	
	@Test
	void sumar70y40yMultiplicadoPor25noDar2700() {
		assertNotEquals(calculadora.multiplicacion(calculadora.suma(70, 40), 25), 2700);
	}

}
