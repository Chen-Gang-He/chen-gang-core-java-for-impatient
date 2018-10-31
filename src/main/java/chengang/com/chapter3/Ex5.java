package chengang.com.chapter3;

import static java.lang.System.out;
/*
Implement a static constant method of the IntSequence class that yields an infinite constant sequence. For example,
IntSequence.constant(1) yields values 1 1 1 . . . , ad infinitum. Extra credit if you do this with a lambda expression.
 */
public class Ex5 {
    public static void main(String[] args) {
        IntSequence infinite = IntSequence.constant(10);
        int i = 0;
        while (infinite.hasNext() && i < 10) {
            out.println(infinite.next());
            i++;
        }
    }

}
