package src.personnage.secondaires;

import src.personnages.principaux.Samourai;
import src.personnages.principaux.Commercant;

public class Traitre extends Samourai {
    private int niveauTraitrise = 0;

    // Constructeur
    public Traitre(String nom, String boisson,
            int argent, String seigneur) {
        super(nom, boisson, argent, seigneur);
    }

    @Override
    public void direBonjour() {
        super.direBonjour();
        parler("J'ai un niveau de traite de " + niveauTraitrise);
    }

    public void extorquer(Commercant c) {
        if (niveauTraitrise == 3) {
            parler("Zut j'ai un niveau de traite de 3, je ne peux plus extorquer");
        } else if (c.getArgent() == 0) {
            parler("Putain le commercant " + c.getNom() +  "n'a pas d'argent a extorquer");
        } else {
            parler("J'extorque le commercant " + c.getNom() + " pour une somme de " + c.getArgent());
            this.gagnerArgent(c.seFaireExtorquer());
            this.niveauTraitrise++;
        }
    }

}
