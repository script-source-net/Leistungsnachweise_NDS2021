package net.cert_achievements.achievement1;

public class Auto {
    private String marke;
    private int anzahlTueren;
    private int ps;

    public Auto(String marke, int anzahlTueren, int ps){
        this.marke = marke;
        this.anzahlTueren = anzahlTueren;
        this.ps = ps;
    }

    public String getMarke() {
        return marke;
    }

    public Auto setMarke(String marke) {
        this.marke = marke;
        return this;
    }

    public int getAnzahlTueren() {
        return anzahlTueren;
    }

    public Auto setAnzahlTueren(int anzahlTueren) {
        this.anzahlTueren = anzahlTueren;
        return this;
    }

    public int getPs() {
        return ps;
    }

    public Auto setPs(int ps) {
        this.ps = ps;
        return this;
    }
}
