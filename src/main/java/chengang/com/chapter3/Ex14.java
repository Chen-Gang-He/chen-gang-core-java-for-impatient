package chengang.com.chapter3;

import java.util.Arrays;
import java.util.Comparator;

/*
Write a call to Arrays.sort that sorts employees by salary, breaking ties by name. Use Comparator.thenComparing. Then do
this in reverse order.
 */
public class Ex14 {

    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new Employee("chen-gang", 102.1),
                new Employee("Joe", 123.43)
        };

        Arrays.sort(employees, Comparator.comparing(Employee::getMeasure)
                .thenComparing(Employee::getName)
                .reversed()
        );
        System.out.println(Arrays.toString(employees));
    }

}
