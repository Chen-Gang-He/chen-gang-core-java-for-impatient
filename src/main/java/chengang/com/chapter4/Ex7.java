package chengang.com.chapter4;

public class Ex7 {
    enum Color {
        BLACK, RED, BLUE, GREEN, CYAN, MAGENTA, YELLOW, WHITE;
        public static Color getRed() {return RED;}
        public static Color getBlue() {return BLUE;}
        public static Color getGreen() {return GREEN;}
    }

    public static void main(String[] args) {
        Color Red = Color.getRed();
        System.out.println(Red);
    }
}
