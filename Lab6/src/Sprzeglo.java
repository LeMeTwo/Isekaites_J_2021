public class Sprzeglo{
    SkrzyniaBiegow skrzyniaBiegow;
    private boolean stanSprzegla;

    public Sprzeglo(boolean stanSprzegla){
        this.stanSprzegla = stanSprzegla;
    }

    public int wcisnij(){
        return 1;
    }

    public int zwolnij(){
        return -1;
    }

}
