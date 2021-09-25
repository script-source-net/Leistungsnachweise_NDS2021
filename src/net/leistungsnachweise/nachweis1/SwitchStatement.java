package net.leistungsnachweise.nachweis1;

public class SwitchStatement {
    public static void main(String[] args) {
        /*
        Eine solche Funktion als Switch zu erstellen macht keinen Sinn
        da viel zu viele Case-Breaks gemacht werden müssten :-)
         */
        int note = 3;
        if(note < 4){
            System.out.println("Ungenügend");
        } else {
            System.out.println("Bestanden");
        }

    }
}
