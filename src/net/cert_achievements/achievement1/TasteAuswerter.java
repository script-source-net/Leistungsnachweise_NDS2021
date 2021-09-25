package net.cert_achievements.achievement1;

import java.util.Scanner;

public class TasteAuswerter {
    public static void main(String[] args) {
        /*
        Ich nutze immer die von java bereits zur Verfügung gestellte
        Bibliotheken. Die IOTools bieten einfach nur einen konfortablere
        Möglichkeit dasselbe zu tun, doch der Code der IOTools ist nicht
        kompakter. :-)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte ein Zahl (0-9) eingeben!");
        int pressedNumbers = sc.nextInt();
        if(pressedNumbers >=0 && pressedNumbers <= 9){
            System.out.println(pressedNumbers);
        } else {
            System.out.println("ungültige Eingabe");
        }
    }
}
