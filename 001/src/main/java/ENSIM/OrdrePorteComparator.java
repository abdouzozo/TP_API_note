package ENSIM;
import java.util.Comparator;

public class OrdrePorteComparator implements Comparator<Porte>{
	
	public int compare(Porte p1, Porte p2) {
		return p1.getNumeroDePorte() - p2.getNumeroDePorte();
	}

}
