package chengang.com.chapter3;

/*
Implement a class Greeter that implements Runnable and whose run method prints n copies of "Hello, " + target, where n
and target are set in the constructor. Construct two instances with different messages and execute them concurrently in
two threads.
 */
public class Ex8 {

    private class Greeter implements Runnable {
        private int n;
        private String target;

        Greeter(int n, String target) {
            n = n;
            target = target;
        }

        Greeter() {
            this(1, "Chen-gang");
        }

        public void run() {
            for (int i = n; i > 0; i--) {
                System.out.println("hello " + target);
            }
        }
    }

    public static void main(String[] args) {
        Greeter greeter1 = new Ex8().new Greeter(10, "chengang");
        Greeter greeter2 = new Ex8().new Greeter(2, "Yu");
        new Thread(greeter1).run();
        new Thread(greeter2).run();

    }
}
