public class Main {
    private static void testPokemonTypes() {
        PokemonEau pe = new PokemonEau("Pokeau");
        PokemonFeu pf = new PokemonFeu("Pokefeu");
        System.out.println(pe);
        System.out.println(pf);

        pe.attaquer(pf);

        pf.attaquer(pe);

        System.out.println(pe);
        System.out.println(pf);
    }

    public static void main(String[] args) {
        testPokemonTypes();
    }
}