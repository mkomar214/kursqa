package dataType;
//        Числовой массив в bool
public class Datatype11 {

    public static void datatype11(){

        int[] arr = {1, 2, 3, 4, 5, 0};
        Boolean[] arrBool = new Boolean[6];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arrBool[i] = false;
            } else {
                arrBool[i] = true;
            }
            System.out.println(arrBool[i]);

        }
    }
}
