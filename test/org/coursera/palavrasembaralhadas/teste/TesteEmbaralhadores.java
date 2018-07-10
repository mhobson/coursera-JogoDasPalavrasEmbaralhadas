package org.coursera.palavrasembaralhadas.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.coursera.palavrasembaralhadas.Embaralhador;
import org.coursera.palavrasembaralhadas.EmbaralhadorAleatorio;
import org.coursera.palavrasembaralhadas.EmbaralhadorInverter;
import org.coursera.palavrasembaralhadas.EmbaralhadorParesImpares;
import org.junit.Test;

public class TesteEmbaralhadores {
	private Embaralhador embaralhador;

	@Test
	public void testEmbaralhadorParesImpares() {
		embaralhador = new EmbaralhadorParesImpares();
		assertEquals("eepaxmlr", embaralhador.embaralharPalavra("exemplar"));
	}
	
	@Test
	public void testEmbaralhadorInverter() {
		embaralhador = new EmbaralhadorInverter();
		assertEquals("ralpmexe", embaralhador.embaralharPalavra("exemplar"));
	}
	
	@Test
	public void testEmbaralhadorAleatorio() {
		embaralhador = new EmbaralhadorAleatorio();
		/* no embaralhador aleatório não se sabe qual será o retorno, neste caso o teste
		verifica se o retorno será qualquer coisa diferente da palavra original */
		assertNotEquals("exemplar", embaralhador.embaralharPalavra("exemplar"));
	}

}
