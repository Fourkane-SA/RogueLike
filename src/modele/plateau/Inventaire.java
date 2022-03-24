package modele.plateau;

public class Inventaire {

 private int nb_cle;
 private int nb_capsule;


 public Inventaire() {
	nb_cle = 0;
	nb_capsule = 0;
 }

 public int getNb_cle() {
	return nb_cle;
 } 

 public void ajouter_cle(int nb_clef) {
	this.nb_cle += nb_clef;
 }	
 public void supprimer_cle(int nb_clef) {
	this.nb_cle -= nb_clef;
 }	
 

 public int getNb_capsule() {
	return nb_capsule;
 }

 public void ajouter_capsule(int nb_c) {
	this.nb_capsule += nb_c;
 }
 
 public void supprimer_capsule(int nb_c) {
	this.nb_capsule -= nb_c;
 }
}
