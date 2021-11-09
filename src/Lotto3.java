import java.util.*;

public class Lotto3 {
    public static void main (String[] args){

        //long start = System.currentTimeMillis();

        //Scanner scan = new Scanner(System.in);

        Random rand = new Random();

        List list1 = new ArrayList(); //wyniki
        List list2 = new ArrayList(); //input

        for(int i = 0; i < 5; i++){
            int helper = Integer.parseInt(args[i]);
            list2.add(helper);
        }


        for(int i = 0; i <= 5; i++){
            list2.add(args[i]);
        }

        int ipow = 0;

        //for (int i = 0; i <= 5; i++){
        //    list2.add(scan.nextInt());
        //}


        while (true){
            while (true) {

            while (list1.size() <= 5){
                int curandom = rand.nextInt(49 - 1 + 1) + 1; //Generally speaking, if you need to generate numbers from min to max (including both), you write
                                                                   //random.nextInt(max - min + 1) + min
                if (list1.contains(curandom)){
                    continue;
                                             }
                else{
                    list1.add(curandom);
                    }
                                    }

            if (list1.containsAll(list2)){
                System.out.println("Wynik losowania:" + list1);
                ipow += 1;
                System.out.println("Trafione: " + list2);
                System.out.println("Liczba powtórzeń: " + ipow);
                //System.out.println("Ilość czasu: " + (System.currentTimeMillis() - start) + " minilisekund");
                break;
                }
            else {
                ipow += 1;
                System.out.print("Pudło: " + list1); //Dałem printa dla heheszków
                list1.clear();
                continue;
            } }
            break;
        }

        }

    }

