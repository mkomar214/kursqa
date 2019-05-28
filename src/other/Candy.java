package other;

import java.util.Scanner;

//          конефеты
public class Candy {


    public static void candy() {
        Scanner in = new Scanner(System.in);  // Задача с фантиками
        System.out.println("Ведите колличество конфет : ");
        int konf = in.nextInt();
        System.out.println("Ведите курс обмена :  ");
        int kurs = in.nextInt();
        int fant = 0;// фантики
        if (konf == 0){
            System.out.println("Нечего есть");
        }
        if (kurs == 1) {
            System.out.println("Объелись");
        }
        for (int i = konf; i >= kurs; ) {
            fant = i % kurs;
            konf = konf + i / kurs;
            i = i / kurs + fant;
            if (i < kurs) {
                System.out.println(konf + " сожрали");
                System.out.println(i + " остаток фаньтиков");


            }
        }
    }
}