package net.leistungsnachweise.nachweis1;

public class BooleanArray {
    public static void main(String[] args) {
        boolean boolArray[] = new boolean[5];
        boolArray[0] = true;
        boolArray[1] = false;
        boolArray[2] = true;
        boolArray[3] = false;
        boolArray[4] = true;

        for (boolean b : boolArray){
            if (b != true){
                System.out.println("Falsch");
            } else {
                System.out.println("Wahr");
            }
        }
    }
}
