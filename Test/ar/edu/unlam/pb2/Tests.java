package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {

	@Test
	public void testQuecalculaRitmo() {
		Persona persona1 = new Persona("Gaston", 33, 70.0, 1.80,5000.0);
		Carrera carrera1 = new Carrera(4.0,50.0, persona1);
		Double vo=carrera1.Ritmo();
		Double ve = 0.08;
		assertEquals(vo,ve);
	}
	
	@Test
	public void testQuecalculoKaloriasPerdidas() {
		Persona persona1 = new Persona("Gaston", 33, 70.0, 1.80,5000.0);
		Carrera carrera1 = new Carrera(4.0,50.0, persona1);
		Double vo=carrera1.KiloCaloriasQuemadas();
		Double ve=280.0;
		assertEquals(ve,vo,0.1);
	}
	
	@Test
	public void testQueCalculoPesoPerdiso() {
		Persona persona1 = new Persona("Gaston", 33, 70.0, 1.80,5000.0);
		Carrera carrera1 = new Carrera(4.0,50.0, persona1);
		carrera1.KiloCaloriasQuemadas();
		carrera1.PesoPerdido();
		Double ve=69.96;
		Double vo = persona1.getPeso();
		assertEquals(ve,vo);
		
	}

}
