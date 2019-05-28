package dataType;

import java.util.Arrays;

//        массив в встоку
public class Datatype9_1 {

    public static void datatype9_1(){

//        массив в встоку
        int[] arr={1,2,3,4,5};
        String new_arr = "";

        for (int i: arr){
            new_arr +=String.valueOf(i)+" ";
        }
        System.out.println(new_arr);



        //            строка в массив // посимвольно
//        String str = "строка";
//        String[] arrStr = new String[]{str, "абв"};
//        System.out.println(arrStr[0]);
//        System.out.println(arrStr[1]);

    }
}
