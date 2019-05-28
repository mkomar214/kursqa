package exception;

public class Finaly {

    public static void finaly(){

        try {
            int num = 1;
            int zero = 0;
            int result = num / zero;
            System.out.println("!");
        }
        finally {
            System.out.println("finaly");
        }
        System.out.println("продолжение");
    }
}
