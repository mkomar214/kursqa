package other;

public class TryCatch {

    public static void tryCatch(){



        try {
            int num = 1;
            int zero = 0;
            int result = num / zero;
            System.out.println("!");
        } catch (ArithmeticException e) {
            System.out.println( e.toString() + ": нельзя делить на ноль");

        }
        finally {
            System.out.println("finaly");
        }
        System.out.println("продолжение");
    }
}
