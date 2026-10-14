package src.personnages.secondaires;

import src.personnages.principaux.Samourai;
import src.personnages.principaux.*;
import src.personnages.*;

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

    public void faireLeGentil(Humain h, int don){
        if (this.getArgent() > don && h != this){
            parler("Je fais le gentil en faisaint un don de " + don +" pour " + h.getNom() );
            h.parler("Merci pour le don " + this.getNom());
            h.gagnerArgent(don);
            this.perdreArgent(don);
            if (this.niveauTraitrise > 0){
                this.niveauTraitrise--;
            }
        } else if (this.getArgent() < don) {
            parler("Je veux faire un don mais j'ai moins de " + don + " sous");
        } else if (h == this){
            parler("Je ne peut pas faire un don a moi meme!!");
        }
    }



}
