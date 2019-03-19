package personnage;

public abstract class Personnage {
    private int niveau;
    private int vie;
    private int force;
    private int agilite;
    private int intelligence;


    public abstract void attaqueBasique();
    public abstract void attaqueSpeciale();
    public abstract String getCriDeGuerre();
    public abstract String getNom();


    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getAgilite() {
        return agilite;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public String getTypePersonnage(){
        return this.getClass().toString();
    };
}
