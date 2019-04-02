import java.util.Scanner;

public class Main {


    public static void main (String... arg){

        Scanner in = new Scanner(System.in);
        System.out.println("Ведите колличество конфет : ");
        int konf = in.nextInt();
        System.out.println("Ведите курс обмена :  ");
        int kurs = in.nextInt();
        int fant = 0;// фантики

        for (int i = konf; i>=kurs;){
            fant=i%kurs;
            konf=konf+i/kurs;
             i=i/kurs+fant;
            if (i<kurs){
                System.out.println(konf + " сожрали");
                System.out.println(i + " остаток фаньтиков");
            }

        }

    }
}

