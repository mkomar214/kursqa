package threads;

public class MyThread extends Thread{


    public void run(){
        SynMethod.synMet();
        System.out.println(currentThread());



    }

}
