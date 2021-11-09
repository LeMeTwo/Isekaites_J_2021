public class SkrzyniaBiegow extends Komponent{
    private int aktualnyBieg = 0;
    private int iloscBiegow = 6;
    private float aktualnePrzelozenie = 0;

    public SkrzyniaBiegow(int aktualnyBieg, int iloscBiegow, float aktualnePrzelozenie){
        this.aktualnyBieg = aktualnyBieg;
        this.iloscBiegow = iloscBiegow;
        this.aktualnePrzelozenie = aktualnePrzelozenie;
    }

    public void zwiekszBieg(){}

    public void zmniejszBieg(){}

    int getAktBieg(){
        return this.aktualnyBieg;
    }

    float getAktualnePrzelozenie(){
        return this.aktualnePrzelozenie;
    }
}
