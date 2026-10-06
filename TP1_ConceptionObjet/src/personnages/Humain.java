package src.personnages;

public class Humain {
    private String nom;
    private int argent;
    private String boisson;

    //Constructeur
    public Humain(String nom, int argent, String boisson){
        this.nom = nom;
        this.argent = argent;
        this.boisson = boisson;
    }

    //Methodes
    public void parler(String texte){
        System.out.println(this.nom + " - " + texte);
    }
    
    public void direBonjour(){
        String msgTexte = "Bonjour! Je m'apelle " + this.nom + " et j'aime boire du " +
        this.boisson;
        parler(msgTexte);

    }

    public void boire(){
        String msgTexte = "Mmm, un bon berre de " + this.boisson + "! GLOUPS !";
        parler(msgTexte);
    }

    public void gagnerArgent(int n){
        if (n > 0){
            this.argent += n;
        }
    }

    public void perdreArgent(int n){
        if (n <= this.argent && this.argent > 0){
            this.argent -= n;
        }
    }

    //Getters
    public int getArgent(){
        return this.argent;
    }

    public String getBoisson(){
        return this.boisson;
    }

    public String getNom(){
        return this.nom;
    }


}
