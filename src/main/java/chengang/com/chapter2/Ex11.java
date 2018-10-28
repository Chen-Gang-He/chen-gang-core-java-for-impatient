package chengang.com.chapter2;


import java.time.LocalDate;

import static java.lang.System.out;
import static java.time.LocalDate.*;

/*
Change the calendar printing program so it starts the week on a Sunday. Also make it print a newline at the end (but
only one).
 */

public class Ex11 {
    private static int getDayIndex(int m, int n) {
        return (m + n) % 7;
    }
    public static void main(String[] args) {
        LocalDate date;
        Integer year, month;
        if (args.length < 2) {
            out.println("Usage: year month");
            date = now();
            month = date.getMonthValue();
            year = date.getYear();
        }
        else {
            year = Integer.parseInt(args[0]);
            month = Integer.parseInt(args[2]);

        }
        date = of(year, month, 1);
        out.println(String.format("year: %d month: %d", year, month));
        out.println(getDayIndex(date.getDayOfWeek().getValue(), 0));
        out.println(" Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < getDayIndex(date.getDayOfWeek().getValue(), 0); i ++ ) {
            out.print("    ");
        }
        while (date.getMonthValue() == month) {
            out.printf("%4d", date.getDayOfMonth());
            if (getDayIndex(date.getDayOfWeek().getValue(), 0) == 6) System.out.println();
            date = date.plusDays(1);
        }
        out.print("\n");
        out.println(" Sun Mon Tue Wed Thu Fri Sat");





    }

}
