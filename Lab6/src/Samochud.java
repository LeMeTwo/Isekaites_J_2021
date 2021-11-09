public class Samochud {
    Zawody zawody;

    private int nrRejest = 797404004;
    private String model = "Fiat";
    private int max = 115;

    public Samochud(int nrRejest, String model, int max){
        this.max = max;
        this.nrRejest = nrRejest;
        this.model = model;
    }

    public boolean wlacz(){
        return true;
    }

    public boolean wulacz(){
        return false;
    }

    public void jedzDo(){}

    public int getWaga(){
        return 1;
    }

    public int getAktPredkosc(){
        return 1;
    }

    public void getAktPozycja(){

    }

    public static void main(String[] args) {
        Samochud Volvo = new Samochud(200, "Volvo", 5000);
        Samochud Skoda = new Samochud(421, "Skoda", 15892);
        System.out.println("Działa");
    }



}

