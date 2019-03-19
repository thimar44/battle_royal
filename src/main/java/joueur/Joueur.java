package joueur;

import personnage.Personnage;

public class Joueur {
    private int numero;
    private Personnage personnage;

    public Joueur(int numero) {
        this.numero = numero;
    }

    public void sePresenter(){
        StringBuilder str = new StringBuilder();
        str.append(personnage.getCriDeGuerre());
        str.append(" je suis le ");
        str.append(personnage.getNom());
        str.append(" Joueur " + numero);
        str.append(" niveau ");
        str.append(personnage.getNiveau());
        str.append(" je possède ");
        str.append(personnage.getVie());
        str.append(" de vitalité, ");
        str.append(personnage.getForce());
        str.append(" de force, ");
        str.append(personnage.getAgilite());
        str.append(" d'agilité et ");
        str.append(personnage.getIntelligence());
        str.append(" d'intelligence !");
        System.out.println(str);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Personnage getPersonnage() {
        return personnage;
    }

    public void setPersonnage(Personnage personnage) {
        this.personnage = personnage;
    }

}
