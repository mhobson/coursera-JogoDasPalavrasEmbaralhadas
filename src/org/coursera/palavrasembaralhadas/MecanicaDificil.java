package org.coursera.palavrasembaralhadas;

public class MecanicaDificil implements MecanicaDoJogo {
	
	private BancoDePalavras bp = new BancoDePalavras();
	private FabricaDeEmbaralhadores fabricaEmbaralhadores = new FabricaDeEmbaralhadores();
	private Embaralhador embaralhador;
	private String palavra;
	private String palavraEmbaralhada;
	private int rodada = 0;
	private int vidaExtra = 0;
	private int pontuacao = 0;

	@Override
	public void iniciaRodada() {
		this.palavra = bp.getPalavra();
		this.embaralhador = fabricaEmbaralhadores.getEmbaralhador(); //a cada rodada a fábrica fornece um embaralhador aleatóriamente
		this.rodada++;
	}
	
	@Override
	public String getPalavraEmbaralhada() {
		this.palavraEmbaralhada = embaralhador.embaralharPalavra(palavra);
		return palavraEmbaralhada;
	}

	@Override
	public String comparar(String palavra) {
		if (this.palavra.equals(palavra.trim().toUpperCase())) {
			pontuacao++;
			return "Acertou!";
		} else
			vidaExtra--;
			return "Errou! a palavra correta era: " + this.palavra;
	}
	
	@Override
	public int getRodada() {
		return rodada;
	}

	@Override
	public int getVidaExtra() {
		return vidaExtra;
	}
	
	@Override
	public String getResultado() {
		if (this.getPontuacao() == 5) {
			return "***** PARABÉNS! Você venceu! *****";
		} else
			return "***** Você Perdeu! *****";

	}
	
	@Override
	public int getPontuacao() {
		return pontuacao;
	}

	@Override
	public boolean fimDoJogo() {
		if (getRodada() == 5 || getVidaExtra() == -1)
			return true;
		else
			return false;
	}

}