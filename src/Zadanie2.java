import java.util.*;



abstract class Animal {
            int iloscNog;

            public void live() {
                System.out.println("I can live.");
            }

            public String getName() {
                return "animal";
            }
        }

        class Bird extends Animal {

            public String getName() {
                return "bird";
            }

            public void fly() {
                System.out.println("I can fly!");
            }
        }

        class Parrot extends Bird {
            private final test test = new test();

            public String getName() {
                return test.getName();
            }

            public void fly() {
                test.fly();
            }
}

class Birb extends Bird{
    public String getName(){
        return "Birb";
    }
}

class Wrona extends Bird{
   public String getName(){
       return "Kra";
   }

}

class Snake extends Animal {
    public String getName() { return "snake";}
    public void sss() {System.out.println("sssssssss");}
}
class Cow extends Animal {
    public String getName() {return "cow";}
    public void milk() {System.out.println("U cant milk a cow");}
}

public class Zadanie2 {
    public static void main(String[] args) {

        Animal a;
        Bird b = new Bird();
        Parrot p = new Parrot();

        a = b;
        System.out.println(a.getName());

        a = p;
        System.out.println(a.getName());

        b = p;
        b.fly();

        p.live(); //dziedziczone!

        Random rand = new Random();


        Animal tablica[] = new Animal[100]; //tablica 100 zwierzat
        //dodaj klasy 2 nowych zwierzar done

        for (int x = 0; x <= 99; x++){
              int testing = rand.nextInt();
              if (testing % 5 == 0){
                  tablica[x] = new Bird();
              }
              else if (testing % 2 == 0){
                  tablica[x] = new Snake();
              }
              else{
                  tablica[x] = new Cow();
              }
        }
        int snakez = 0;
        int cowz = 0;
        int birdz = 0;
        for (int x = 0; x <= 99; x++){
            if (tablica[x] instanceof Snake){
                snakez += 1;
            }
            else if (tablica[x] instanceof  Bird){
                birdz += 1;
            }
            else {
                cowz += 1;
            }
        }

        System.out.println("Krów " + cowz);
        System.out.println("Ptaków " + birdz);
        System.out.println("Węży " + snakez);

       // for(int x = 0; x <= 99; x++){
       //     System.out.println(tablica[x].getName());
       // }
        //dodaj losowo różne zwierzęta do tablicy done
        //wykorzystaj funkcję Random z pakietu java.util done
        //wypisz w pętli nazwy wszystkich zwierząt done

    }
}