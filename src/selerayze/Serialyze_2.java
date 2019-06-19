package selerayze;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;


public class Serialyze_2 {

    public static void main (String... arg) throws IOException {
        JsonSer name = new JsonSer();
        name.a = "aaa";
        name.b = "bbb";
        StringWriter jsonName = new StringWriter();
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(jsonName, name);
        System.out.println(jsonName.toString());

    }
}

class JsonSer {

    public String a;
    public String b;
}

