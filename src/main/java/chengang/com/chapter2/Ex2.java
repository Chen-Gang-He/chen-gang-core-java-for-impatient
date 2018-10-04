/*
 * Copyright (c) 1994, 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */

/*
Consider the nextInt method of the Scanner class. Is it an accessor or mutator? Why? What about the nextInt method of
the Random class?

We say that a method is a mutator if it changes the object on which it was invoked.
 */
package chengang.com.chapter2;


import java.util.Calendar;

public class Ex2 {
    public static void main(String[] args) {
        /**
         // * Scans the next token of the input as an <tt>int</tt>.
         // * This method will throw <code>InputMismatchException</code>
         // * if the next token cannot be translated into a valid int value as
         // * described below. If the translation is successful, the scanner advances
         // * past the input that matched.
         *  It means it will change state of instance
         */


    }

    void test(String x) {
        //language=JSON
        String json = "{\"name\": \"Max\"}";
        System.out.println(x);
    }

    private void test() {
        test3();
    }

    private void test3() {
        Calendar calendar = Calendar.getInstance();
    }
}
