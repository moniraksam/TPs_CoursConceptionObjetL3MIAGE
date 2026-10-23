public class PokemonPlante extends Pokemon {

    // Constructeur
    public PokemonPlante(String nom) {
        super(nom, TypePokemon.Type.PLANTE);
    }

    @Override
    public void attaquer(Pokemon p) {
        if (p != null) {
            log("J'attaque " + p.getNom());
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

        if (p.getType() == TypePokemon.Type.EAU) {
            log("C'est tres efficace!");
            degats *= 2;
        } else {
            log("Ce n'est pas tres efficace...");
        }

        this.hp = Math.max(0, this.hp - degats);
    }

}
