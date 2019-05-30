package threads;

public class Threads {

    static MyThread thread_1 = new MyThread();
    static MyThread thread_2 = new MyThread();
    static ArreyThread thread1 = new ArreyThread();
    static ArreyThread thread2 = new ArreyThread();
    static ArreyThread thread3 = new ArreyThread();
    static ArreyThread thread4 = new ArreyThread();
    static ArreyThread thread5 = new ArreyThread();
    static ArreyThread thread6 = new ArreyThread();
    static ArreyThread thread7 = new ArreyThread();
    static ArreyThread thread8 = new ArreyThread();
    static ArreyThread thread9 = new ArreyThread();
    static ArreyThread thread10 = new ArreyThread();

    public static void main(String[] args) {

//        thread_1.start();
//        thread_2.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();



    }
}
