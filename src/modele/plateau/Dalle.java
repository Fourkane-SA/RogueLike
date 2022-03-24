package modele.plateau;

public class Dalle extends EntiteStatique {

	 private Ramassable objet;
	 private boolean state; // true = bleu | false = rouge 
	 
	 public Dalle(Jeu _jeu,boolean State) {
		 super(_jeu);
		 this.state = State;
	 }
	 
	 public boolean isState() {
		return state;
	}

	public void eteindre() {
		this.state = true; 
		
	}

		 
	 @Override
	 public boolean traversable() {
	        return state;
	 }
	 
	 

}
