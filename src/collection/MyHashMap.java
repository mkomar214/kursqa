package collection;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {

    public static void hashmap(){
    Map<String, String > map = new HashMap<>();
    map.put("qwe", "Вася");
    map.put("asda", "qweqwe");
    map.put("1","12");


        for (Map.Entry entry:map.entrySet()) {

            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());

        }
}
}
