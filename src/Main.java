import java.util.Scanner;

public class Main {


    public static void main (String... arg){

        Scanner in = new Scanner(System.in);
        System.out.println("Ведите колличество конфет : ");
        int k = in.nextInt();
        System.out.println("Ведите курс обмена :  ");
        int c = in.nextInt();
        
    int g = 0; // съеденые
    int h ;// фантики

        for (int b = k/c; b>=1;) {
            h = b%c;
            g = g+k;
            b = b/c;
            k = k/c+h;
            if (b==0) {
                System.out.println(g + " сожрали");
                System.out.println(h + " остаток фаньтиков");
            }
        }

    }
}
