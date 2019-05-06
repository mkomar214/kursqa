package circle;

public class Circle2 {

    public static void circle2(){
        //послеусловие
       int a = 15;
       do {
           a--;
           System.out.println("a: " +a);
       }
       while (a>10);

       //предусловие
       int b = 13;
       while (b>10){
           b--;
           System.out.println("b: " + b);
       }

    }
}
