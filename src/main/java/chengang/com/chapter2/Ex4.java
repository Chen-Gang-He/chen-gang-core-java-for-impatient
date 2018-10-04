package chengang.com.chapter2;

import org.omg.CORBA.IntHolder;

/*
write a method that swaps the contents of two IntHolder objects. (Look up this rather obscure class in the API
documentation.)
 */
public class Ex4 {

    static void swap(IntHolder m, IntHolder n) {
        int tmp = n.value;
        n.value = m.value;
        m.value = tmp;
    }

    public static void main(String[] args) {
        IntHolder o = new IntHolder(1);
        IntHolder p = new IntHolder(2);
        swap(o, p);
        System.out.println(o.value);
    }
}
