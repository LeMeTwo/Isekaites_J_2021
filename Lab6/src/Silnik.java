public class Silnik extends Komponent{
    private int obroty;
    private int MaxObroty;

    public Silnik() {
        this.obroty = 0;
        this.MaxObroty = 3600;
    }


    public Silnik(int obroty, int MaxObroty, int cena, String nazwa, double waga){
        super(cena, nazwa, waga);
        this.obroty = obroty;
        this.MaxObroty = MaxObroty;
    }

    public int getObroty() {
        return obroty;
    }

    public void uruchom(){
        this.obroty = 600;
        System.out.println("Uruchomiony");
    }
    public void zatrzymaj(){
        this.obroty = 0;
        System.out.println("Wyłączony");
    }
    public void zwiększObroty(){
        this.obroty += 100;
    }
    public void zmniejszObroty(){
        this.obroty -= 100;
    }

}