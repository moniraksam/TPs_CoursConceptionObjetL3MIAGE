package src.histoires;

import src.personnages.Humain;
import src.personnages.principaux.*;
import src.personnages.secondaires.*;

class Monhistoire {
    public static void main(String[] args) {
        Commercant c = new Commercant("Joachim", 500);
        // Yakuza y = new Yakuza("Alex", 50, "Vodka", "Pros");
        // Ronin R = new Ronin("Balls", 0, "pepper");
        // // Samourai S = new Samourai("Zhao", 500, "tout", "Gotoka");
        // // S.direBonjour();
        // // S.boire("Taurine Power");
        // Ronin musaichi = new Samourai("Akimoto" , "the" , 20, "Miyamoto");
        // Samourai x = (Samourai) musaichi;

        // Humain humain = new Humain("Prof", 10, "Porto");
        // humain.direBonjour();
        // humain.boire();
        // Commercant commercant = new Commercant("Marchand", 35);
        // commercant.direBonjour();
        // Yakuza yakusa = new Yakuza("Yaku␣le␣noir", 42,
        // "biere", "WarSong");
        // yakusa.direBonjour();
        // yakusa.extorquer(commercant);
        // Ronin ronin = new Ronin("Roro", 61, "sake");
        // ronin.donner(10, commercant);
        // ronin.provoquer(yakusa);
        // ronin.direBonjour();

        Traitre T = new Traitre("balls", "nomi", 5000, "zhao xina");

        Grandmere G = new Grandmere("baba yaga", 500, "the");
        // G.faireConnaissanceAvecHumain(c);
        // G.faireConnaissanceAvecHumain(T);
        // G.ragouter();
        Ninja N = new Ninja("Yozo", 0, "tang posion");
        N.direBonjour();
    }
}