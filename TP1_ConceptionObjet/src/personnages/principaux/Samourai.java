package src.personnages.principaux;

import src.personnages.principaux.Ronin;

public class Samourai extends Ronin {

    private String seigneur;

    // Constructeur
    public Samourai(String nom, int argent, String boisson,
            String seigneur) {
        super(nom, argent, boisson);
        this.seigneur = seigneur;
    }

    public void boire(String boisson) {
        String texte = "MMM un bon verre de " + boisson + "\n";
        parler(texte);
    }

    @Override
    public void direBonjour() {
        super.direBonjour();
        parler("Mon seigneur est " + this.seigneur);
    }

}
