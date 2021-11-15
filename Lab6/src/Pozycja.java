public class Pozycja {
    Samochud samochud;
    private double x = 0;

    public void setSamochud(Samochud samochud) {
        this.samochud = samochud;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    private double y = 0;

    public Pozycja(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double[] getXY(){
        double pos[] = {x,y};
        return pos;
    }

}
