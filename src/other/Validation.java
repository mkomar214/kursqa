package other;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    public static void validation(){

                List<String> emails = new ArrayList();
        emails.add("qweqq@qwe.asdasdasdada");
        emails.add("xcbxcb@dxcvx.we.iwe");
        emails.add("asdas1@sadasd.com");
        emails.add("usasda.nasada@dosadas.com");
        emails.add("usasda#@dcxvcxvin.xcvx.xxxxxcvn");
        emails.add("uasdasd@dxcvxcvx");
        emails.add("fgnfgn#dfgnfgn.fgnbgf");
        emails.add("@fgnfgn.ru");

        String regex = "^[A-Za-z0-9]+@[a-z]+.[a-z]+$";

        Pattern pattern = Pattern.compile(regex);

        for(String email : emails){
            Matcher matcher = pattern.matcher(email);
            System.out.println(email +" : "+ matcher.matches());
        }
    }
}

