package org.coursera.palavrasembaralhadas;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		FabricaMecanicaDoJogo fmj = new FabricaMecanicaDoJogo();
		MecanicaDoJogo mecanicaJogo = null;
		String palavraDigitada;
		int nivel;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("***** BEM VINDO AO JOGO DAS PALAVRAS EMBARALHADAS! *****");
		System.out.println("--> ATENÇÃO! O jogo NÃO diferencia letras maiúsculas/minúsculas.");
		System.out.println("--> ATENÇÃO! O jogo CONSIDERA as acentuações.\n");
		
		do {
			System.out.println("Escolha o nível desejado para começar ou '0' para sair...");
			System.out.println("1 - Fácil (Objetivo: Acertar 5 palavras com direito a 2 erros)");
			System.out.println("2 - Difícil (Objetivo: Acertar 5 palavras sem direito a erro)");
			System.out.println("0 - Sair do jogo.\n");
			
			do {
				System.out.print("Digite aqui a sua opção: ");
				nivel = Integer.parseInt(in.nextLine());
				if (nivel == 1) {
					System.out.println("Nível FÁCIL selecionado!\n");
					mecanicaJogo = fmj.getMecanicaJogo(nivel);
				} else if (nivel == 2) {
					System.out.println("Nível DIFÍCIL selecionado!\n");
					mecanicaJogo = fmj.getMecanicaJogo(nivel);
				} else if (nivel == 0) {
					System.out.println("Opção SAIR selecionada!\n");
				} else {
					System.out.println("Opção inválida!\n");
				}
			} while(nivel != 0 && nivel != 1 && nivel != 2); //não sai do laço enquanto um nivel válido não for digitado (0, 1 ou 2)
			
			if (nivel != 0) { //executa este bloco somente se nivel for diferente de zero
				while(!mecanicaJogo.fimDoJogo()) {
					mecanicaJogo.iniciaRodada();
					System.out.println("Palavra embaralhada " + mecanicaJogo.getRodada() + ": " + mecanicaJogo.getPalavraEmbaralhada());
					System.out.print("Digite aqui a palavra correta: ");
					palavraDigitada = in.nextLine();
					
					System.out.println(mecanicaJogo.comparar(palavraDigitada) + "\n");
				}
				
				System.out.println(mecanicaJogo.getResultado());				
				System.out.println("-> Nº de Acertos: " + mecanicaJogo.getPontuacao() + "\n");
				
			}
			
		} while(nivel != 0); //repete tudo se nivel não for zero
		
		in.close();
		System.out.println("***** Fim do Jogo! *****");
	}
}
