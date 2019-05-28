package dataType;

import java.util.Arrays;

// строку в массив
public class Datatype9_2 {

    public static void datatype9_2(){
        String arr = "1 2 3 4 5";
        String[] new_arr = new String[5];
        String[] del = arr.split(" ");
        for (int i=0; i<new_arr.length; i++){
            new_arr[i]= del[i];
        }
        System.out.println(Arrays.toString(new_arr));

    }
}
