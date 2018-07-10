package org.coursera.palavrasembaralhadas;

import java.util.Arrays;
import java.util.List;

public class EmbaralhadorInverter implements Embaralhador {

	@Override
	public String embaralharPalavra(String palavra) {
		//separa as letras da palavra com o metodo split() e armazena as letras em uma lista de Strings
        List<String> listaLetras = Arrays.asList(palavra.trim().split(""));
        
        //cria objeto de StringBuilder (utilizado para manipular caracteres string)
        StringBuilder palavraEmbaralhada = new StringBuilder(palavra.length());
        
        //laço For para inverter a ordem das letras
        for(int i=listaLetras.size()-1; i >= 0; i--) {
			palavraEmbaralhada.append(listaLetras.get(i)); //juntando as letras da lista com o metodo append() para formar a palavra invertida
		}

        return palavraEmbaralhada.toString();
	}

}
