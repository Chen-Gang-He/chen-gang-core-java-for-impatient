package chengang.com.chapter4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
Measure the performance difference between a regular method call and a method call via reflection.

Used https://stackoverflow.com/questions/19557829/faster-alternatives-to-javas-reflection
 */
public class Ex12 {
    private static final int ITERATIONS = 7_000_000;
    private static int min(int x, int y) {return x < y ? x : y;}
    private static int regularCall(int x) {
        int result = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            result += min(200, x);
        }
        return result;
    }

    private static int reflectionCall(int x, Method m ) {
        int result = 0;
        try {
            for (int i = 0; i < ITERATIONS; i++) {
                result += (int) m.invoke(null, 200, x);
            }
        } catch (InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) throws NoSuchMethodException{
        long startTime = System.currentTimeMillis();
        regularCall(1);
        System.out.println(String.format("Regular Call: %d", System.currentTimeMillis() - startTime));

        long startTime2 = System.currentTimeMillis();
        Method m = Ex12.class.getDeclaredMethod("min", int.class, int.class);
        reflectionCall(1, m);
        System.out.println(String.format("Regular Call: %d", System.currentTimeMillis() - startTime2));
    }
}
