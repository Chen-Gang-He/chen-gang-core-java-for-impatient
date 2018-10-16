package chengang.com.chapter3;

import chengang.com.chapter2.Gist;

public class Ex10 extends Gist {
    private String own;

    public Ex10 (String own ) {
        super("subclass");
        this.own = own;

    }

    public Ex10 () {
        this("default subclass");
    }


    String print(Ex10 other) {
        return super.name + other.name + protectedShow(this);
    }


    public static void main(String[] args) {
        Gist gist = new Gist("base class");
        Ex10 ex10 = new Ex10("own");
        // System.out.println(super.name);
        System.out.println(ex10.print(ex10));
    }


}
