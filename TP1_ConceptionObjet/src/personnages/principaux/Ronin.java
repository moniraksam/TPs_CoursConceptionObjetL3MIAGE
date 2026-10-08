package src.personnages.principaux;

import src.personnages.Humain;

public class Ronin extends Humain {
    
    private int honneur = 1;

    //Constructeur
    public Ronin(String nom, int argent, String boisson){
        super(nom, argent, boisson);


    }

    //Methodes
    public void donner(int n, Commercant c){
        if (n > 0){ 
            parler("Recoit mon argent, une somme de " + n + ", cher commercant " + c.getNom());
            perdreArgent(n);
            c.parler("Merci beaucoup cher Ronin " + this.getNom() + " , pour la somme de " + n);
            c.gagnerArgent(n);
        }
    }

    public void provoquer(Yakuza y){
        if (this.honneur * 2 > y.getReputation()){
            this.parler("JAI GAGNER UN DUEL CONTRE LE YAKUZA " + y.getNom() + " DU CLAN " + y.getClan() + 
            "JE GAGNE EN REPUTATION ET TOUT LARGENT DU YAKUZA");
            gagnerArgent(y.perdreDuel());
            this.honneur++;
        } else if (this.honneur < y.getReputation()) {
            y.gagnerDuel();
            parler("NOO JAI PERDU UN DUEL");
        }
    }
}
