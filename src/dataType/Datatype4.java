package dataType;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Datatype4 {

    public static void datatype4(){
        Scanner in = new Scanner(System.in);
        System.out.println("Код : ");
        String code = in.next();
        Map< String , String> map = new HashMap<>();
        map.put("1","11");
        map.put("2","21");
        map.put("3","31");
        map.put("4","41");
        if (map.containsKey(code) ){
        System.out.println(map.get(code));
        }
        else {System.out.println("Нет такого товара");
        }

    }
}
