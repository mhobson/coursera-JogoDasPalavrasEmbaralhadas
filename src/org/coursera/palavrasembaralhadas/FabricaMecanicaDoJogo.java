package org.coursera.palavrasembaralhadas;

public class FabricaMecanicaDoJogo {
	
	private MecanicaDoJogo mecanicaJogo;
	
	public MecanicaDoJogo getMecanicaJogo(int i) {
		if (i == 1) {
			mecanicaJogo = new MecanicaFacil();
			return mecanicaJogo;
		} else if (i == 2) {
			mecanicaJogo = new MecanicaDificil();
			return mecanicaJogo;
		} else
			return null;
	}

}
