import java.util.*;

public class Lotto2 {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        Random rand = new Random();

        List list1 = new ArrayList(); //wyniki
        List list2 = new ArrayList(); //input


        for (int i = 0; i <= 5; i++){
            list2.add(scan.nextInt());
        }

            while (list1.size() <= 5){
                int curandom = rand.nextInt(49-1 + 1) + 1; //Generally speaking, if you need to generate numbers from min to max (including both), you write
                //random.nextInt(max - min + 1) + min
                if (list1.contains(curandom)){
                    continue;
                }
                else{
                    list1.add(curandom);


                }
            }


            System.out.println("Wynik losowania:" + list1);

            int itrafien = 0;
            for (int j = 0; j <= 5; j++){
                if (list2.contains(list1.get(j))){
                    itrafien += 1;
                }
            }
            System.out.println(itrafien);
        }


    }
