package chengang.com.chapter1;
/*
 Section 1.5.3, “String Comparison,” on p. 21 has an example of two strings s and t so that s.equals(t) but s != t. Come
 up with a different example that doesn’t use substring)
 */
public class Ex9 {
    public static void main(String[] args) {
        String in = "abc";
//        String b = String.format("%s%s%s", "a" , "b" , "c");
        StringBuilder bb = new StringBuilder("cba").reverse();
        String b = bb.toString();
        System.out.println(in == b);
        System.out.println(in.equals(b));

    }
}
