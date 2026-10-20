import java.util.Random;

public class Pokemon0 {
    private final static int maxNiveau = 10;
    private String nom;
    private int niveau;
    private int hp;
    private int atk;

    public static Random R = new Random();

    // Constructeur
    public Pokemon0(String nom) {
        this.nom = nom;
        this.niveau = R.nextInt(maxNiveau + 1);
        this.hp = 2 * this.niveau;
        this.atk = (niveau / 2) + 1;
    }

    // Methods
    public boolean isKo() {
        if (this.hp == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void soigner() {
        this.hp = 2 * this.niveau;
    }

    public void attaquer(Pokemon0 p) {
        if (p.isKo() != true && p != null) {
            if (this.getAtk() > p.getHp()) {
                log(nom);
                System.out.print(" J'attaque " + p.getNom() + "\n");
                p.hp = 0;
            } else {
                log(nom);
                System.out.print(" J'attaque " + p.getNom() + "\n");
                p.hp -= this.getAtk();
            }
        }
    }

    public void log(String msg) {
        System.out.print("[Pokemon " + this.nom + "] : ");
    }

    // Getters
    public String getNom() {
        return this.nom;
    }

    public int getNiveau() {
        return this.niveau;
    }

    public int getHp() {
        return this.hp;
    }

    public int getAtk() {
        return this.atk;
    }

    // Redefinitions
    @Override
    public String toString() {
        log(nom);
        return String.format(this.nom + "\n\t" + "Niveau : " + this.niveau +
                "\n\t" + "HP : " + this.hp + "\n\t" + "Attack Degat : " + this.atk + "\n");
    }
}