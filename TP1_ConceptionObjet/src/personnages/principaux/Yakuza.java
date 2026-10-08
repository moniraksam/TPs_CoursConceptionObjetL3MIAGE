package src.personnages.principaux;

import src.personnages.Humain;

public class Yakuza extends Humain {
    private String clan;
    private int reputation;


    //Constructeur
    public Yakuza(String nom, int argent, String boisson, 
        String clan){
            super(nom, argent, boisson);
            this.clan = clan;
            this.reputation = 0;
        }

    public void extorquer(Commercant c){
        parler("VA TE FAIRE EXTORQUER SALE COMMERCANT " + c.getNom().toUpperCase() + "!!\n");
        gagnerArgent(c.seFaireExtorquer());
        this.reputation++;
    }

    public void gagnerDuel(){
        this.reputation++;
        parler("JAI GAGNER UN DUEL CONTRE UN RONIN, JE GAGNE EN REPUTATION");
    }

    public int perdreDuel(){
        int sommeArgent = getArgent();
        this.reputation--;
        perdreArgent(this.getArgent());
        parler("PUTAIN JAI PERDU UN DUEL CONTRE UN RONIN, MON ARGENT EST PERDU ET MA REPUTATION PREND UN COUP");
        return sommeArgent;
    }



    //Overrided Methods
    @Override 
    public void direBonjour(){
        super.direBonjour();
        String texte = "Je suis du clan " + this.clan + "\n";
        parler(texte);
    }



    //Getters
    public String getClan(){
        return this.clan;
    }

    public int getReputation(){
        return this.reputation;
    }
}
