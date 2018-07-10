package org.coursera.palavrasembaralhadas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FabricaDeEmbaralhadores {
	
	private Embaralhador embaralhador;
	
	public Embaralhador getEmbaralhador() {
		List<Embaralhador> embaralhadores = new ArrayList<>(); //criando uma lista de embaralhadores

		//populando a lista de embaralhadores
		embaralhadores.add(new EmbaralhadorAleatorio());
		embaralhadores.add(new EmbaralhadorInverter());
		embaralhadores.add(new EmbaralhadorParesImpares());
		
		Collections.shuffle(embaralhadores); //embaralha a ordem da lista de embaralhadores a cada execução de getEmbaralhador()
		
		embaralhador = embaralhadores.get(0); //embaralhador recebe a posição '0' da lista de embaralhadores
		
		return embaralhador;
	}

}
