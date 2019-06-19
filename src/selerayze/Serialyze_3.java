package selerayze;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Serialyze_3 {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        TestJson result = mapper.readValue(new FileInputStream("src/testJson.json"), TestJson.class);
        String[]arrResult = new String[result.getData().size()];
        for (int i = 0; i< result.getData().size(); i++){
             arrResult[i]= result.getData().get(i).getFrom().getName();

        }
        System.out.println(Arrays.toString(arrResult));

    }

}
// схема
class Data {
    private String message;
    private Form from;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Form getFrom() {
        return from;
    }

    public void setFrom(Form from) {
        this.from = from;
    }
}
class TestJson{
    private List<Data> data;
    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }
}
class Form {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    private String age;
}

