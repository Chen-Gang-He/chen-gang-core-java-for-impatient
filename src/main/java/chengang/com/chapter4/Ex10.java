package chengang.com.chapter4;


/*
Use the MethodPrinter program in Section 4.5.1, “Enumerating Class Members,” on p. 160 to enumerate all methods of the
int[] class. Extra credit if you can identify the one method (discussed in this chapter) that is wrongly described.
 */


import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Ex10 {
    private static void methodPointer(Object o) {
        Class<?> cls = o.getClass();
        // while (cls != null) {
        //     for (Method m : cls.getDeclaredMethods()) {
        //         System.out.println(String.format("Modifier=[%s], Return Type=[%s], Method Name=[%s], Parameters=[%s]",
        //         Modifier.toString(m.getModifiers()), m.getReturnType().getSimpleName(), m.getName(), Arrays.toString(m.getParameters())));
        //     }
        walkMethod(cls);
        }


    private static void walkMethod(Class cls) {
        if (cls != null) {
            for (Method m : cls.getDeclaredMethods()) {
                System.out.println(String.format("Modifier=[%s], Return Type=[%s], Method Name=[%s], Parameters=[%s]",
                        Modifier.toString(m.getModifiers()), m.getReturnType().getSimpleName(), m.getName(), Arrays.toString(m.getParameters())));
            }
            walkMethod(cls.getSuperclass());
        }


    }

    public static void main(String[] args) {
        int[] i = new int[1];
        methodPointer(i);
    }
}
