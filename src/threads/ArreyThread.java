package threads;

public class ArreyThread extends Thread{

    public void run(){
        SynMethod.arrMethod();
        System.out.println(currentThread());
    }
}
