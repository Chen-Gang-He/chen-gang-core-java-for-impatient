package chengang.com.chapter4;
/*
The Class class has six methods that yield a string representation of the type represented by the Class object. How do
they differ when applied to arrays, generic types, inner classes, and primitive types?
 */

class GenericClass<T> {
    private T t;
    GenericClass(T t) {
        this.t = t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
public class Ex8 {
    class InnerClass {
        private String s;
        InnerClass(String s) {
            this.s = s;
        }
    }

    public static void main(String[] args) {
        Class<?> cl1 = int[].class;
        Class<?> cl2 = GenericClass.class;
        Class<?> cl3 = InnerClass.class;
        Class<?> cl4 = int.class;
        System.out.println("Canonical name:");
        System.out.println(cl1.getCanonicalName());
        System.out.println(cl2.getCanonicalName());
        System.out.println(cl3.getCanonicalName());
        System.out.println(cl4.getCanonicalName());
        System.out.println("Simple name:");
        System.out.println(cl1.getSimpleName());
        System.out.println(cl2.getSimpleName());
        System.out.println(cl3.getSimpleName());
        System.out.println(cl4.getSimpleName());
        System.out.println("Type name:");
        System.out.println(cl1.getTypeName());
        System.out.println(cl2.getTypeName());
        System.out.println(cl3.getTypeName());
        System.out.println(cl4.getTypeName());
        System.out.println("Name:");
        System.out.println(cl1.getName());
        System.out.println(cl2.getName());
        System.out.println(cl3.getName());
        System.out.println(cl4.getName());
        System.out.println("toString:");
        System.out.println(cl1);
        System.out.println(cl2);
        System.out.println(cl3);
        System.out.println(cl4);
        System.out.println("Generic string:");
        System.out.println(cl1.toGenericString());
        System.out.println(cl2.toGenericString());
        System.out.println(cl3.toGenericString());
        System.out.println(cl4.toGenericString());
    }

}
