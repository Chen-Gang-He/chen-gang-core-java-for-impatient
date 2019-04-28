package chengang.com.chapter4;

import java.util.Objects;

/**
 *
 */
public class Ex5 {

    public static void main(String[] args) {
        Line line = new Line(new Point(0, 0), new Point(10, 0));
        Line line2 = line.clone();
        System.out.println("xxx");
        System.out.println(line.to == line2.to);
        System.out.println(Objects.equals(line.to, line2.to));

    }
}
