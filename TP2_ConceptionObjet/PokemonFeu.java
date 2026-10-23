public class PokemonFeu extends Pokemon {

    // Constructeur
    public PokemonFeu(String nom) {
        super(nom, TypePokemon.Type.FEU);
    }

    @Override
    public void attaquer(Pokemon p) {
        if (p != null && p != this) {
            log("J'attaque " + p.getNom() + ": " + this.getType() + " vs " + p.getType() + "\n");
            p.subir(this);
        }

    }

    @Override
    public void subir(Pokemon p) {
        if (this.isKO()) {
            System.out.println("Le pokemon " + this.getNom() + " est deja KO.");
            return;
        }

        if (p.isKO()) {
            System.out.println("Le pokemon " + p.getNom() + " est deja KO.");
            return;
        }

        int degats = p.getAtk();

        if (p.getType() == TypePokemon.Type.PLANTE) {
            log("C'est tres efficace!\n");
            degats *= 2;
        } else {
            log("Ce n'est pas tres efficace...\n");
        }

        this.hp = Math.max(0, this.hp - degats);
        if (this.isKO()){
            log("Je suis KO!\n");
        }
    }

}
