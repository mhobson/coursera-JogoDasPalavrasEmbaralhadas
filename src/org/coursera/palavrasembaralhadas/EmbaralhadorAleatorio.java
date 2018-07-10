package org.coursera.palavrasembaralhadas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmbaralhadorAleatorio implements Embaralhador {
	
	@Override
	public String embaralharPalavra(String palavra) {
		//separa as letras da palavra com o metodo split() e armazena as letras em uma lista de Strings
        List<String> listaLetras = Arrays.asList(palavra.trim().split(""));

        Collections.shuffle(listaLetras); //embaralha aleatoriamente a lista de letras com o metodo shuffle()
        
        //cria objeto de StringBuilder (utilizado para manipular caracteres string)
        StringBuilder palavraEmbaralhada = new StringBuilder(palavra.length());
        for (String letra : listaLetras) {
        	palavraEmbaralhada.append(letra); //juntando as letras da lista com o metodo append() para formar a palavra embaralhada
        }

        return palavraEmbaralhada.toString();
	}

}
