public class Komponent{
    private int cena = 2512;
    private String nazwa = "Lol";
    private double waga = 150;


    public Komponent(int cena, String nazwa, double waga){
        this.nazwa = nazwa;
        this.cena = cena;
        this.waga = waga;
    }

    public Komponent() {}

    public String getNazwa(){
        return nazwa;
    }
    public double getWaga(){
        return waga;
    }
    public int getCena() {
        return cena;
    }

}

