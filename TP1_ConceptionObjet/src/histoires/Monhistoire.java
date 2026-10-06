package src.histoires;

import src.personnages.principaux.*;;

class Monhistoire {
    public static void main(String[] args) {
        Commercant c = new Commercant("Joachim", 500);
        Yakuza y = new Yakuza("Alex", 50, "Vodka", "Pros");
        y.extorquer(c);
        y.perdreDuel();
        y.gagnerDuel();
        System.out.println(y.getArgent());

    }
}