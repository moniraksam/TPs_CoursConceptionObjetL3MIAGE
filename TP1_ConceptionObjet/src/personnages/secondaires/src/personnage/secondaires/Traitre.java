package src.personnage.secondaires;

import src.personnages.principaux.Samourai;

public class Traitre extends Samourai {
    private int niveauTraitrise = 0;


    //Constructeur 
    public Traitre(String nom, String boisson, 
        int argent, String seigneur 
    ){
        super(nom, boisson, argent, seigneur);
    }

}
