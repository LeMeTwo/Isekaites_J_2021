public class Samochud {
    Pozycja pozycja;
    Silnik silnik;
    SkrzyniaBiegow skrzyniaBiegow;

    private int nrRejest = 797404004;
    private String model = "Fiat";
    private int max = 115;
    private int stan = 0;

    public Samochud(){}


    public Samochud(int nrRejest, String model, int max, Silnik silnik, SkrzyniaBiegow skrzyniaBiegow, int stan){
        this.max = max;
        this.nrRejest = nrRejest;
        this.model = model;
        this.skrzyniaBiegow = skrzyniaBiegow;
        this.silnik = silnik;
        this.stan = stan;
    }

    public int getStan() {
        return this.stan;
    }

    public void jedzDo(double x, double y){
        this.pozycja.setX(x);
        this.pozycja.setY(y);
    }

    public double getWaga(){
        return (this.silnik.getWaga() + this.skrzyniaBiegow.getWaga());
    }

    public double getAktPredkosc(){
        return (this.silnik.getObroty() * this.skrzyniaBiegow.getAktualnePrzelozenie());
    }

    public void getAktPozycja(){
        this.pozycja.getXY();
    }

    public void wuoncz(){
        this.silnik.uruchom();
        this.stan = 1;
    }

    public void wyuoncz(){
        this.silnik.zatrzymaj();
        this.stan = 0;
    }



    public static void main(String[] args) {
        Samochud Volvo = new Samochud(200, "Volvo", 5000, new Silnik(), new SkrzyniaBiegow(), 0);

        Samochud Skoda = new Samochud(421, "Skoda",
                15892, new Silnik(5, 10, 15, "Kek", 52 ), new SkrzyniaBiegow(), 0);

        Samochud Dummy = new Samochud();
        System.out.println("Działa");
    }



}

