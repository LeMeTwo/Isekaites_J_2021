public class Zadanie1 {
    public static void main(String[] args) {

        int zakres = 50;

        if (args.length > 0)
            if (Integer.parseInt(args[0]) > 0)
                System.out.println(args[0]);

    }
}
