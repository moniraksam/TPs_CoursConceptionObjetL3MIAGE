package src.personnages.secondaires;


import src.personnages.Humain;

import java.util.Random;
import java.util.random.*;


public class Grandmere extends Humain {
    private Humain[] memoire = new Humain[30];
    private int nbHumains;

    Random r = new Random();


    public Grandmere(String nom, int argent, String boisson){
        super(nom, argent, "tisane");
        this.nbHumains = 0;

    }

    public void faireConnaissanceAvecHumain(Humain humain){
        if (nbHumains < memoire.length && humain != null){
            memoire[nbHumains] = humain;
            nbHumains++;
        } else {
            parler("Je suis trop vielle pouir me souvenir de plus de 30 humains");

        }
    }

    public void ragouter(){
        for(Humain h : memoire){
            if (h != null && h instanceof Traitre){
                parler("Je sais que " +  h.getNom() + " est un " + h.getClass().getSimpleName());
            } else if (h != null){
                parler("Je pense que " +  h.getNom() + " est un " + h.getClass().getSimpleName());
            } else {
                continue;
            }

        }
    }


    public Humain humainHasard(){
        int r1 = r.nextInt(30);
        return memoire[r1];
    }


    public int getnbHumains(){
        return nbHumains;
    }

    
}
