package src.personnages.principaux;

import src.personnages.Humain;

public class Commercant extends Humain {

    // Constructeur
    public Commercant(String nom, int argent) {
        super(nom, argent, "the");

    }

    // Methodes
    public int seFaireExtorquer() {
        if (this.getArgent() > 0) {
            int sommeArgent = getArgent();
            perdreArgent(getArgent());
            parler("Le monde est vraiment trop injuste...");
            return sommeArgent;
        } else {
            parler("Je n'ai rien a me faire extorquer!!");
            return 0;
        }
    }

    public void recevoir(int n) {
        parler("MERCI RONIN POUR LE CASH");
        gagnerArgent(n);
    }

}
