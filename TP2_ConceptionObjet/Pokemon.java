import java.util.Random;

public abstract class Pokemon {
    private final static int niveauMax = 10;
    private String nom;
    private int niveau;
    protected int hp;
    private int atk;
    private TypePokemon.Type type;

    public static Random R = new Random();

    // Constructeur
    public Pokemon(String nom, TypePokemon.Type type) {
        this.nom = nom;
        this.niveau = R.nextInt(niveauMax + 1);
        this.hp = 2 * this.niveau;
        this.atk = (niveau / 2) + 1;
        this.type = type;
    }

    // Methods
    public boolean isKO() {
        if (this.hp == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void soigner() {
        this.hp = 2 * this.niveau;
    }

    // Abstract methodes
    public abstract void attaquer(Pokemon p);

    public abstract void subir(Pokemon p);

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

    public TypePokemon.Type getType(){
        return this.type;
    }

    // Redefinitions
    @Override
    public String toString() {
        log(nom);
        return String.format(this.nom + "\n\t" + "Niveau : " + this.niveau +
                "\n\t" + "Type :" + this.type + "\n\t" + "HP : " + this.hp + "\n\t" + "Attack Degat : " + this.atk + "\n");
    }
}