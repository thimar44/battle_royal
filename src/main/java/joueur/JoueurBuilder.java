package joueur;

import personnage.Guerrier;
import personnage.Personnage;
import personnage.Rodeur;
import personnage.Mage;

import java.util.Scanner;

public class JoueurBuilder {

    public Joueur creationJoueur(int i) {
        Joueur joueur = new Joueur(i);
        System.out.println("Création du personnage du Joueur " + i);
        definirClasse(joueur);
        definirNiveauPersonnage(joueur);
        definirForcePersonnage(joueur);
        definirAgilitePersonnage(joueur);
        definirIntelligencePersonnage(joueur);
        joueur.sePresenter();
        return joueur;
    }

    private void definirClasse(Joueur joueur) {
        boolean choixValide = false;
        int choix;
        while (choixValide == false) {
            System.out.println("Veuillez choisir la classe de votre personnage(1: Guerrier, 2 Rôdeur, 3 : Mage");
            Scanner sc = new Scanner(System.in);
            choix = sc.nextInt();
            if (choix == 1) {
                joueur.setPersonnage(new Guerrier());
                choixValide = true;
            }
            else if( choix == 2) {
                joueur.setPersonnage(new Rodeur());
                choixValide = true;
            } else if ( choix == 3) {
                joueur.setPersonnage(new Mage());
                choixValide = true;
            }
        }
    }

    private void definirNiveauPersonnage(Joueur joueur) {
        boolean choixValide = false;
        int choix;
        while (choixValide == false) {
            System.out.println("Niveau du personnage ?");
            Scanner sc = new Scanner(System.in);
            choix = sc.nextInt();
            if (choix >= 1 && choix <= 100) {
                joueur.getPersonnage().setNiveau(choix);
                joueur.getPersonnage().setVie(choix*5);
                choixValide = true;
            }
            else {
                System.out.println("Le niveau du joueur doit être compris entre 1 et 100.");
            }
        }
    }

    private void definirForcePersonnage(Joueur joueur) {
        boolean choixValide = false;
        int choix;
        while (choixValide == false) {
            System.out.println("Force du personnage ?");
            Scanner sc = new Scanner(System.in);
            choix = sc.nextInt();
            if (choix >= 0 && choix <= 100) {
                if (choix <= joueur.getPersonnage().getNiveau()) {
                    joueur.getPersonnage().setForce(choix);
                    choixValide = true;
                } else {
                    System.out.println("Le total force + agilité + intelligence doit être égal au niveau du joueur.");
                }
            }
            else {
                System.out.println("La force du joueur doit être comprise entre 0 et 100.");
            }
        }

    }

    private void definirAgilitePersonnage(Joueur joueur) {
        boolean choixValide = false;
        int choix;
        while (choixValide == false) {
            System.out.println("Agilité du personnage ?");
            Scanner sc = new Scanner(System.in);
            choix = sc.nextInt();
            if (choix >= 0 && choix <= 100) {
                int sommeAgiliteForce = choix + joueur.getPersonnage().getForce();
                if (sommeAgiliteForce <= joueur.getPersonnage().getNiveau()) {
                    joueur.getPersonnage().setAgilite(choix);
                    choixValide = true;
                } else {
                    System.out.println("Le total force + agilité + intelligence doit être égal au niveau du joueur.");
                }

            }
            else {
                System.out.println("L'agilité du joueur doit être comprise entre 0 et 100.");
            }
        }

    }

    private void definirIntelligencePersonnage(Joueur joueur) {
        boolean choixValide = false;
        int choix;
        while (choixValide == false) {
            System.out.println("Intelligence du personnage ?");
            Scanner sc = new Scanner(System.in);
            choix = sc.nextInt();
            if (choix >= 0 && choix <= 100) {
                int sommeForceAgiliteIntelligence = choix + joueur.getPersonnage().getForce() + joueur.getPersonnage().getAgilite();
                if (sommeForceAgiliteIntelligence == joueur.getPersonnage().getNiveau()) {
                    joueur.getPersonnage().setIntelligence(choix);
                    choixValide = true;
                } else {
                    System.out.println("Le total force + agilité + intelligence doit être égal au niveau du joueur.");
                }
            }
            else {
                System.out.println("L'intelligence du joueur doit être comprise entre 0 et 100.");
            }
        }
    }

}
