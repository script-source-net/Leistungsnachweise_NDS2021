package net.leistungsnachweise.nachweis1;

public class Summe {
    public static void main(String[] args) {
        int summer = 0;
        int lowerBound = 1;
        int upperBound = 100;
        for (int i = lowerBound; i <= upperBound; i++){
            summer += i;
        }
        System.out.println("Summe aller Zahlen von " + lowerBound + " bis " + upperBound +": " + summer);
    }
}
