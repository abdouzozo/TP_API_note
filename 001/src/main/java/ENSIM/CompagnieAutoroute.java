package ENSIM;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;



public class CompagnieAutoroute {
	
	public List<Route> routes = new ArrayList<Route>();
	public List<Tarif> tarifs = new ArrayList<Tarif>();
	
	
	CompagnieAutoroute(){}
	
	BigDecimal obtenirTarif(Porte Pentree, Porte Psortie) {		
		if( getTarifExacte(Pentree,Psortie) != null )
			return getTarifExacte(Pentree,Psortie).getPrix();
		
		else {
			return getTarifCalcule(Pentree,Psortie).getPrix();
		}
	}
	
	//current_tarif.setPrix(getTarifCalcule(,Psortie).getPrix() + current_tarif.getPrix());
	
	Tarif getTarifCalcule(Porte entree, Porte sortie) {
		Tarif current_tarif = new Tarif();
		current_tarif.setEntree(entree);
		current_tarif.setSortie(sortie);
		current_tarif.setPrix(new BigDecimal(0));
		
		int numEntree = entree.getNumeroDePorte();
		int numSortie = sortie.getNumeroDePorte();
		
		
		while(numEntree != numSortie) {
			for(int i=0; i<tarifs.size() ; i++) {
				if(tarifs.get(i).getEntree().getNumeroDePorte() == numEntree && tarifs.get(i).getSortie().getNumeroDePorte() ==numEntree + 1) {
					current_tarif.setPrix((tarifs.get(i).getPrix().add(current_tarif.getPrix())));
					numEntree ++;
					break;
				}
			}
		}
		tarifs.add(current_tarif);
		return current_tarif;
	}
	
	Tarif getTarifExacte(Porte entree, Porte sortie) {
		
		for(int i=0;i<tarifs.size();i++) {
			if(tarifs.get(i).getEntree().equals(entree) && tarifs.get(i).getSortie().equals(sortie)) {
				return tarifs.get(i);
			}
		}
		return null;
	}
	
	void ajouterTarif(Tarif tarif) {
		tarifs.add(tarif);
		;
		
	}
	
	void ajouterRoute(Route route) {
		routes.add(route);
		//Collections.sort(routes, new OrdrePorteComparator());
		
	}
	

	
	

}
