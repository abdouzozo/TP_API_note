package ENSIM;

import java.math.BigDecimal;

public class Voyage {
	
	private Porte entree;
	private Porte sortie;
	private CompagnieAutoroute autoroute;
	
	Voyage(Porte entree, Porte sortie, CompagnieAutoroute autoroute){}

	public Porte getEntree() {
		return entree;
	}

	public void setEntree(Porte entree) {
		this.entree = entree;
	}

	public Porte getSortie() {
		return sortie;
	}

	public void setSortie(Porte sortie) {
		this.sortie = sortie;
	}

	public BigDecimal getTarif() {
		//TODO : fonction to get tarif
		return new BigDecimal(0);
	}


	public CompagnieAutoroute getAutoroute() {
		return autoroute;
	}

	public void setAutoroute(CompagnieAutoroute autoroute) {
		this.autoroute = autoroute;
	}
	
	

}
