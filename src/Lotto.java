import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto {
    public static void main (String[] args){
        Random rand = new Random();
        List list1 = new ArrayList();
        for (int i = 0; i <= 0; i++) { //tak się nie robi. Rozwiązanie tymczasowe - okazało się trwałe. P.Jajszczyk.
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
    System.out.println(list1);
    }


}}
