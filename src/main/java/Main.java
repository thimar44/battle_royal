import joueur.Joueur;
import joueur.JoueurBuilder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("hey john");
        JoueurBuilder joueurBuilder = new JoueurBuilder();

        Joueur joueur1 = joueurBuilder.creationJoueur(1);
        Joueur joueur2 = joueurBuilder.creationJoueur(2);
    }
}
