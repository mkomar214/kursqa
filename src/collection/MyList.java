package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyList {

    public static void mylist (){

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        list.add(3,"10");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
