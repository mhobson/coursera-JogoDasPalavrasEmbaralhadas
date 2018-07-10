package org.coursera.palavrasembaralhadas;

import java.util.Arrays;
import java.util.List;

public class EmbaralhadorParesImpares implements Embaralhador{

	@Override
	public String embaralharPalavra(String palavra) {
		//separa as letras da palavra com o metodo split() e armazena as letras em uma lista de Strings
        List<String> listaLetras = Arrays.asList(palavra.trim().split(""));
        
        String palavraEmbaralhada;
        //cria objeto de StringBuilder (utilizado para manipular caracteres string)
        StringBuilder letrasPares = new StringBuilder();
        StringBuilder letrasImpares = new StringBuilder();
        //StringBuilder palavraEmbaralhada = new StringBuilder(palavra.length());
        for (int i = 0; i < listaLetras.size(); i++) {
        	if (i % 2 == 0) {
        		letrasPares.append(listaLetras.get(i)); //juntando as letras pares da lista com o metodo append()
        	} else
        		letrasImpares.append(listaLetras.get(i)); //juntando as letras impares da lista com o metodo append()
        }

        //juntando as letras pares com as impares para formar a palavra embaralhada 
        palavraEmbaralhada = letrasPares.toString() + letrasImpares.toString();
        
        return palavraEmbaralhada;
	}

}
