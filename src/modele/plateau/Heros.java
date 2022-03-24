/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.plateau;

/**
 * Héros du jeu
 */
public class Heros {
    private int x;
    private int y;
    private int orientation; // NORD = 0 | EST = 1 | SUD = 2 | OUEST = 3

    private Jeu jeu;
    
    private Inventaire inv;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Heros(Inventaire _inv,Jeu _jeu, int _x, int _y) {
        jeu = _jeu;
        x = _x;
        y = _y;
        inv = _inv;
    }

    public void droite() {
        if (traversable(x+1, y)) {
            x ++;
            orientation = 1;
        }
    }

    public void gauche() {
        if (traversable(x-1, y)) {
            x --;
            orientation = 3;
        }
    }

    public void bas() {
        if (traversable(x, y+1)) {
            y ++;
            orientation = 2;
        }
    }

    public void haut() {
        if (traversable(x, y-1)) {
            y --;
            orientation = 0;
        }
    }

    private boolean traversable(int x, int y) {

        if (x >0 && x < jeu.SIZE_X && y > 0 && y < jeu.SIZE_Y) {
            return jeu.getEntite(x, y).traversable();
        } else {
            return false;
        }
    }
}
