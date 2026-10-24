import java.util.Random;

public class Dresseur {
    private String nom;
    private int argent;
    private Pokemon[] sacADos;
    private static Random random = new Random();

    // Cosntructeur
    public Dresseur(String nom, int argent) {
        this.nom = nom;
        this.argent = argent;
        this.sacADos = new Pokemon[3];
    }

    // Methods
    public int nbPokemonsDanSac() {
        int nb = 0;
        for (int i = 0; i < this.sacADos.length; i++) {
            if (sacADos[i] != null) {
                nb++;
            }
        }
        return nb;
    }

    public boolean peutCombattre() {
        boolean atLeastOne = false;
        for (Pokemon p : sacADos) {
            if (!(p.isKO())) {
                atLeastOne = true;
            }
        }

        return atLeastOne && this.argent > 0;
    }

    public Pokemon prochainPokemon() {
        for (Pokemon p : sacADos) {
            if (!(p.isKO())) {
                return p;
            }
        }

        System.out.println("No pokemon left available for trainer : " + this.nom + "\n");
        return null;
    }

    public void prendreArgent(Dresseur adversaire) {
        if (adversaire != null && adversaire.argent > 0) {
            System.out.println("Hahaha " + this.nom + " prends l'argent de " + adversaire.getNom());
            adversaire.argent -= Math.max(0, adversaire.argent - 10);
            this.argent += 10;
        }
    }

    public void combattre(Dresseur d) {
        if (d != null){
            System.out.println("DUEL COMMENCE ENTRE " + this.nom + " ET " +  d.getNom());
            
        }

    }

    // Getters
    public String getNom() {
        return this.nom;
    }

}
