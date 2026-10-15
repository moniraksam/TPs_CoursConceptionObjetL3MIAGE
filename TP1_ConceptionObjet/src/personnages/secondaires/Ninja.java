package src.personnages.secondaires;

import java.util.Random;
import java.util.random.*;

import src.personnages.principaux.Yakuza;

public class Ninja extends Yakuza {
        private final static String[] clansNinja = 
        {"of Shadows", "of Mist", "of Clouds", "of Fog", "of Darkness"};

        static Random r = new Random();

        public Ninja(String nom, int argent, String boisson){
            super(nom, argent, boisson, clansNinja[r.nextInt(clansNinja.length)] );
            
        }



}
