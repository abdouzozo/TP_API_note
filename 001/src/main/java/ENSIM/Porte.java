package ENSIM;
import java.util.Objects;
public class Porte {
	private int numeroDePorte;
	
	public int getNumeroDePorte() {
		return numeroDePorte;
	}

	public void setNumeroDePorte(int numeroDePorte) {
		this.numeroDePorte = numeroDePorte;
	}

	Porte(int num){
		this.numeroDePorte = num;	
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(numeroDePorte);
	}
	
	@Override
	public String toString() {
		return "numeroDePorte : " + numeroDePorte;
	}
	
	
	public boolean equals(Porte porte) {
		return this.numeroDePorte == porte.numeroDePorte;
	}

	

}
