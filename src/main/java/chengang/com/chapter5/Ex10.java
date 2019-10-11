package chengang.com.chapter5;

import java.math.BigInteger;
class LastElememntException extends Exception {
     LastElememntException() {}
     LastElememntException(String message) {
        super(message);
    }
}
public class Ex10 {

    static BigInteger multiple(Integer n) {
        try {
            if (n == 1) {
                throw new LastElememntException();
            } else return BigInteger.valueOf(n).multiply(multiple(n - 1));
        } catch (LastElememntException e) {
            e.printStackTrace();
            return BigInteger.valueOf(1);
        }
    }

    public static void main(String[] args) {
        System.out.println(multiple(3));
    }
}
