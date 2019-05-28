package dataType;

import java.util.Scanner;

public class Datatype5 {

    public static void datatype5() {

        Scanner n = new Scanner(System.in);
        System.out.println("Введите целое число");
        int num = n.nextInt();
        int ost = num % 2;
        if (ost == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечетное число");
        }

    }
}