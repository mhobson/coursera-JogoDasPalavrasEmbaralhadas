package org.coursera.palavrasembaralhadas;

public interface MecanicaDoJogo {
	
	public void iniciaRodada();
	
	public String getPalavraEmbaralhada();
	
	public String comparar(String palavra);
	
	public int getRodada();
	
	public int getVidaExtra();
	
	public String getResultado();
	
	public int getPontuacao();
	
	public boolean fimDoJogo();
}
