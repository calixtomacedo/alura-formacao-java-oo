package br.com.cmdev.tddejava;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		Integer soma = calc.somar(3, 7);
		
		assertEquals(Integer.valueOf(10), soma);
	}

}
