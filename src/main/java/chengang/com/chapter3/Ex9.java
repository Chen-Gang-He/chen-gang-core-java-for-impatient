package chengang.com.chapter3;

/*
Implement methods:
public static void runTogether(Runnable... tasks)
public static void runInOrder(Runnable... tasks)

The first method should run each task in a separate thread and then return. The second method should run all methods in
the current thread and return when the last one has completed.
 */
public class Ex9 {
    public static void runTogether(Runnable... tasks){
        for (Runnable r: tasks) {
            new Thread(r).run();
        }
    }

    public static void runInOrder(Runnable... tasks) {
        for (Runnable r: tasks) {
            r.run();
        }
    }

    public static void main(String[] args) {
        Ex9.runInOrder(() -> System.out.println("Hello"), () -> System.out.println("World"));
        Ex9.runTogether(() -> System.out.println("Hello"), () -> System.out.println("World"));
    }
}
