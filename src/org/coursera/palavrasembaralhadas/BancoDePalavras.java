package org.coursera.palavrasembaralhadas;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BancoDePalavras {
	private List<String> listaPalavras = new ArrayList<>();
	private String palavra;
	
	public BancoDePalavras() {
		try {
			lerArquivo("src/com/coursera/palavrasembaralhadas/arquivos/palavras.txt", StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getPalavra() {
		selecionarPalavra();
		return palavra.toUpperCase().trim();
	}
	
	private void selecionarPalavra() {
		Collections.shuffle(listaPalavras); //embaralha a lista de palavras
		this.palavra = listaPalavras.get(0); //palavra recebe a posição '0' da lista de palavras 
		listaPalavras.remove(0); //remove da lista a última palavra selecionada, para evitar palavras repetidas
	}
	
	private void lerArquivo(String path, Charset charset) throws IOException {
		try {
			byte[] encoded = Files.readAllBytes(Paths.get(path));
		    String conteudo = charset.decode(ByteBuffer.wrap(encoded)).toString();
		    
		    this.listaPalavras.addAll(Arrays.asList(conteudo.split("\n"))); //cada linha do arquivo é colocada em uma linha da lista
		}
			catch (IOException e) {
			e.getMessage();
		}
	}
	
}