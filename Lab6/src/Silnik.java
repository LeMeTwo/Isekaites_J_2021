public class Silnik extends Komponent{
    private int obroty = 0;
    private int MaxObroty = 3600;
    public Silnik(int obroty, int MaxObroty){
        this.obroty = obroty;
        this.MaxObroty = MaxObroty;
    }

    public void uruchom(){}
    public void zatrzymaj(){}
    public void zwiększObroty(){}
    public void zmniejszObroty(){}

}