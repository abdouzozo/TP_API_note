package ENSIM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Route {
	
	public List<Porte> portes;
	
	Route(){
		portes = new ArrayList<Porte>();
	}
	
	void addPorte(Porte nv_porte) {
		portes.add(nv_porte);
		Collections.sort(portes, new OrdrePorteComparator());
	}
	
	public String toString() {
		return "C'est une route";
	}
	
	

}
