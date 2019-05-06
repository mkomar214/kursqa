package objects;


public class Object1 {


    public static String test(String a){

        String name = Object1.class.getName().toString()+" "+a;
        return name;

    }
}
