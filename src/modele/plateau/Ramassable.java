package modele.plateau;

public abstract class Ramassable {
	private boolean est_ramasse;
	
	public Ramassable() {
		est_ramasse = false;
	}
	
	public boolean getEst_ramasse() {
		return est_ramasse;
	}

	public void setEst_ramasse() {
			this.est_ramasse = true;
		
	}
	
	
}
