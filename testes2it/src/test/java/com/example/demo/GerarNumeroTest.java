package com.example.demo;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.angelo.gerar.numero.GerarNumero;

public class GerarNumeroTest {



	@Test
	public void testGerarNumeroCMaiorQuePermitido() {
		int a = 10256, b = 512;
		GerarNumero gerarNumero = new GerarNumero();
		assertEquals(-1 , gerarNumero.gerarNumeroC(a, b));
	}
	@Test
	public void testGerarNumeroCNoLimitePermitido() {
		int a = 1025, b = 51;
		GerarNumero gerarNumero = new GerarNumero();
		assertEquals(150125 , gerarNumero.gerarNumeroC(a, b));
	}

}
