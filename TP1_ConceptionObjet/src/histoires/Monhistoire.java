package src.histoires;

import src.personnages.principaux.*;;

class Monhistoire {
    public static void main(String[] args) {
        Commercant c = new Commercant("Joachim", 500);
        Yakuza y = new Yakuza("Alex", 50, "Vodka", "Pros");
    
        Ronin R  = new Ronin("Balls", 0, "pepper");
        R.provoquer(y);

    }
}