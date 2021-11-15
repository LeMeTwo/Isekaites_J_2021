public class SkrzyniaBiegow extends Komponent{

    Sprzeglo sprzeglo;

    private int aktualnyBieg;

    public SkrzyniaBiegow(int cena, String nazwa, double waga, Sprzeglo sprzeglo, int aktualnyBieg, int iloscBiegow, float aktualnePrzelozenie) {
        super(cena, nazwa, waga);
        this.sprzeglo = sprzeglo;
        this.aktualnyBieg = aktualnyBieg;
        this.iloscBiegow = iloscBiegow;
        this.aktualnePrzelozenie = aktualnePrzelozenie;
    }

    private int iloscBiegow = 6;
    private float aktualnePrzelozenie = 0;

    public SkrzyniaBiegow() {
        super();
        this.aktualnePrzelozenie = 0;
        this.iloscBiegow = 6;
        this.aktualnyBieg = 0;
    }

    public SkrzyniaBiegow(int aktualnyBieg, int iloscBiegow, float aktualnePrzelozenie, int cena, String nazwa, double waga){
        super(cena, nazwa, waga);
        this.aktualnyBieg = aktualnyBieg;
        this.iloscBiegow = iloscBiegow;
        this.aktualnePrzelozenie = aktualnePrzelozenie;
    }

    public void zwiekszBieg(){
        if (this.aktualnyBieg < this.iloscBiegow){
            this.aktualnyBieg += 1;
        }
    }

    public void zmniejszBieg(){
        if (this.aktualnyBieg >= -1){
            this.aktualnyBieg -= 1;
        }
    }

    int getAktBieg(){
        return this.aktualnyBieg;
    }

    double getAktualnePrzelozenie(){
        return this.aktualnePrzelozenie;
    }
}
