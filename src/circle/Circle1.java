package circle;

import java.math.BigInteger;
import java.util.Scanner;
        // метод работающий как факториал
public class Circle1 {

    public static String circle1(int k){

        BigInteger a= new BigInteger(String.valueOf(k)); // значение факториала
        BigInteger  fact = new BigInteger("1");
        BigInteger i;
        for (i= new BigInteger("1"); ; i = i.add(BigInteger.ONE)){
            fact = fact.multiply(i);
            if (i.equals(a)){
                System.out.println("факториал :"+ fact);
                break;
            }
        }

        return (fact.toString());
    }
}
