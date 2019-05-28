package dataType;
//        прибавить к кажому элементу hello
public class Datatype10 {
    public static void datatype10(){

        String[] arr = {"a","b","c"};
        for (int i = 0 ;i<arr.length; i++ ){
            arr[i]= arr[i]+" hello";
            System.out.println(arr[i]);

        }

    }
}
