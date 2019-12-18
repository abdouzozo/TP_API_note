package ENSIM;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Tarif {
	
	private Porte entree;
	private Porte sortie;
	private LocalDateTime dateValidite;
	private BigDecimal prix;
	
	Tarif(Porte entree, Porte sortie, BigDecimal prix){
		this.entree = entree;
		this.sortie = sortie;
		this.prix = prix;
	}
	
	Tarif(){
	}

	public String toString() {
		return "tarif : "+ prix;
	}
	
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

	public LocalDateTime getDateValidite() {
		return dateValidite;
	}

	public void setDateValidite(LocalDateTime dateValidite) {
		this.dateValidite = dateValidite;
	}

	public BigDecimal getPrix() {
		return prix;
	}

	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}
	
}
