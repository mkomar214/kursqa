package dataType;
//        среднеарифметическо массива
public class Datatype2 {

    public static void datatype2() {
        double[] arr = {1, 2, 3, 4, 5, 6, 7, 8,};
        double result = 0;
        for (double i : arr) {
            result = result + i;
        }
        result = result / arr.length;
        System.out.println(result);
    }
}
