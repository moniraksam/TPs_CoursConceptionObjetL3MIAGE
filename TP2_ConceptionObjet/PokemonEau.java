public class PokemonEau extends Pokemon {

    // Constructeur
    public PokemonEau(String nom) {
        super(nom, TypePokemon.Type.EAU);
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

        if (p.getType() == TypePokemon.Type.FEU) {
            log("C'est tres efficace!");
            degats *= 2;
        } else {
            log("Ce n'est pas tres efficace...");
        }

        this.hp = Math.max(0, this.hp - degats);
    }

}
