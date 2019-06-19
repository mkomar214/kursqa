package selerayze;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class Serialyze_1 {
    public static void main(String[] args) throws IOException {
        List<String> name = new ArrayList<>();
        name.add("Коля");
        name.add("Вася");
        name.add("Петя");

        StringWriter jsonName = new StringWriter();
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(jsonName, name);
        System.out.println(jsonName.toString());

    }


}

