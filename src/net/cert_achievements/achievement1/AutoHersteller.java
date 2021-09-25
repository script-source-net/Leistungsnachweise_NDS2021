package net.cert_achievements.achievement1;

public class AutoHersteller {
    public static void main(String[] args) {
        Auto[] car = new Auto[3];
        // Car 1
        car[0].setMarke("Audi");
        car[0].setAnzahlTueren(5);
        car[0].setPs(200);
        // Car 2
        car[1].setMarke("Mercedes-Benz");
        car[1].setAnzahlTueren(3);
        car[1].setPs(180);
        // Car 3
        car[2].setMarke("Sauber F1");
        car[2].setAnzahlTueren(0);
        car[3].setPs(657);

        /*
        Es gäbe auch die Möglichkeit das ganze in einer for-Schleife
        mit dem Scanner oder den IOTools abzufragen und so die Daten
        variabel zu setzen. Zustäzlich gibt es hier kein PrintOut, da
        es nicht gewünscht wurde.
         */
    }
}
