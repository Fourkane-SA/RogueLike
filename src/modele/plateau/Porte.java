package modele.plateau;

public class Porte {

	private boolean est_verouille;

	
	public Porte() {
		est_verouille = true;
	}
	
	public boolean getEst_Verouille() {
		return est_verouille;
	}

	public void deverouille() {
		this.est_verouille = false;
	}
	
	
}
