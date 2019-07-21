package chengang.com.chapter4;

/*
Write a “universal” toString method that uses reflection to yield a string with all instance variables of an object.
Extra credit if you can handle cyclic references.
 */



import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class Foo {
    private String s;
    protected  int i;
    public boolean b;
    static int staticInt = 100;

    Foo(String s, int i, boolean b) {
        this.s = s;
        this.i = i;
        this.b = b;
    }
}

public class Ex9 {
    public static String toString(Object o) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Field f: o.getClass().getDeclaredFields()) {
            int x = f.getModifiers();
            if (Modifier.isStatic(x)) {
                System.out.println(String.format("Field %s: is static", f.getName()));
            }
            f.setAccessible(true);
            try {
                Object v = f.get(o);
                stringBuilder.append(String.format("Modifier=[%s], Type=[%s], Field Name=[%s], Value=[%s]\n", Modifier.toString(x), f.getType().getSimpleName(), f.getName(), v));

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Foo foo = new Foo("String Field", 1, true);
        System.out.println(toString(foo));
    }

}
