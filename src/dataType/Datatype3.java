package dataType;

import java.math.BigInteger;

//        факториал числа
public class Datatype3 {

    public static void datatype3() {

            BigInteger a= new BigInteger("21");// значение факториала
        BigInteger  fact = new BigInteger("1");
        BigInteger i;
        for (i= new BigInteger("1"); ; i = i.add(BigInteger.ONE)){
            fact = fact.multiply(i);
            if (i.equals(a)){
                System.out.println("факториал :"+ fact);
                break;
            }
        }
    }
}
