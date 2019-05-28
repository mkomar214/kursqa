package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySet {
    public static void set(){

        Set<String> hashset = new HashSet<>();
        hashset.add("123");
        hashset.add("asdasd");
        hashset.add("123");

        Iterator<String> iterator = hashset.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }

    }
}
