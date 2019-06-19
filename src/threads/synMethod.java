package threads;


import java.util.Arrays;
import java.util.Random;

class SynMethod {

    public synchronized static  void synMet() {
        Random ran = new Random();
        int rNum = ran.nextInt(10);
        System.out.println("Синхронизированый" + rNum);

    }
        public static void arrMethod(){
        int[] arr = new int[5];
        for( int i= 0;i<arr.length;i++){
        Random ran = new Random();
        int rNum = ran.nextInt(10);
        arr[i]= rNum;
        }
            System.out.println(Arrays.toString(arr));
    }
}
