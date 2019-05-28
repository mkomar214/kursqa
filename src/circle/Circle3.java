package circle;

import java.util.Random;

//            Рандомный массим
public class Circle3 {

    public static void circle3(){


        Integer[] arr = new Integer[5];
        for (Integer i : arr) {
            Random ran = new Random();
            int rNum = ran.nextInt(10);

            i = rNum;
            if (i == 5) {
                System.out.println(i);
            }
        }
    }
}
