package operators;

import java.util.Scanner;
      // Время деньги
public class TimeMoney {

    public static void timeMoney(){
        Scanner in = new Scanner(System.in);
        System.out.println("Время : ");
        int time = in.nextInt();
        System.out.println("Деньги :  ");
        int money = in.nextInt();

        if (time >8 && time <12 && money >10){
            System.out.println("Идем в мазазин");
        }
        if (time>12&& money >50)
        {
            System.out.println("Идем в кафе");

        }
        if (time<19 && money<50)
        {
            System.out.println("Идем к соседу");
        }
        if (time>19 &&time<22)
        {
            System.out.println("Смотрим телевизор");
        }
         if (time > 22 )
        {
            System.out.println("Идем спать");
        }


    }
}
