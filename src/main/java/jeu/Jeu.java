package jeu;

import joueur.Joueur;
import personnage.Personnage;

public class Jeu {
    private Joueur joueur1;
    private Joueur joueur2;
    private int numeroDuProcainJoueur;
    private boolean finDeLaPartie;

    private Jeu(Joueur joueur1, Joueur joueur2) {
       this.joueur1 = joueur1;
       this.joueur2 = joueur2;
       numeroDuProcainJoueur = 1;
       finDeLaPartie = false;
    }

    private void combattre() {
        while (!finDeLaPartie) {

            numeroDuProcainJoueur = changerDeJoueur(numeroDuProcainJoueur);
        }

    }

    private int changerDeJoueur(int joueurActuel) {
        if (joueurActuel == 1 ) {
            return 2;
        } else if (joueurActuel == 2) {
            return 1;
        } else {
            throw new IllegalArgumentException("Un partie ne peut avoir qu'un joueur n°1 et un joueur n°2");
        }
    }





}
