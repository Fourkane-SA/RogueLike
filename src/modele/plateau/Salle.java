package modele.plateau;

public class Salle {
	
	private int dim_x;
	private int dim_y;
	private Jeu _jeu;
	private EntiteStatique[][] grilleEntitesStatiques = new EntiteStatique[dim_x][dim_y];
	
	public Salle(int x, int y,Jeu jeu) {
		this.dim_x = x;
		this.dim_y = y;
		this._jeu = jeu;
		
	}
	
	private void addEntiteStatique(EntiteStatique e, int x, int y) {
	        grilleEntitesStatiques[x][y] = e;

	}
	
	public void initialiserMuir() {
		// murs exterieurs horizontaux
	    for (int x = 0; x < 20; x++) {
	        addEntiteStatique(new Mur(this._jeu), x, 0);
	        addEntiteStatique(new Mur(this._jeu), x, 9);
	    }

	    // murs exterieurs verticaux
	    for (int y = 1; y < 9; y++) {
	        addEntiteStatique(new Mur(this._jeu), 0, y);
	        addEntiteStatique(new Mur(this._jeu), 19, y);
	    }

	    addEntiteStatique(new Mur(this._jeu), 2, 6);
	    addEntiteStatique(new Mur(this._jeu), 3, 6);
	}
	
	public void initialiserEntite() {
		for (int x = 0; x < this.dim_x; x++) {
	        for (int y = 0; y < this.dim_y; y++) {
	            if (grilleEntitesStatiques[x][y] == null) {
	                grilleEntitesStatiques[x][y] = new CaseNormale(this._jeu);
	            }

	        }
	    }
	}   
}
