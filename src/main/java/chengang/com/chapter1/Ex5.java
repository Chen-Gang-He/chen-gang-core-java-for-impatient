package chengang.com.chapter1;

/*
What happens when you cast a double to an int that is larger than the largest possible int value? Try it out.
 */

public class Ex5 {
    public static void main(String[] args) {
        Integer i = Integer.MAX_VALUE;
        double max = Integer.MAX_VALUE + 1;
        int maxInt = (int) max;
        System.out.println(i);
        System.out.println(max);
        System.out.println(maxInt);


    }
}
