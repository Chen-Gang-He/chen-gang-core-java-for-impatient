package chengang.com.chapter2;

import chengang.com.chapter3.Ex10;

// import static java.lang.System.println;


public class Gist {
    protected String name;
    private String test;
    public Gist () {
        this("");
    }
    public Gist (String name) {
        this.name = name;
    }

    protected String protectedShow(Gist other) {
        return String.format("protectedShow %s %s ", other.getClass(), other.name);
    }

    public String show(Gist other) {
        return other.name;
    }

    public String showPrivate(Gist other) {
        return other.test;
    }

    public static void main(String[] args) {
        Ex9 ex9 = new Ex9();
        Ex9.Car car = ex9.new Car(0.0D, 10.0D, 10.0D);
        Gist gist = new Gist();
//        Ex10 ex10 = new Ex10("own");
        System.out.println("xxxx");
//        System.out.println(gist.show(ex10));
//        System.out.println(gist.showPrivate(ex10));

    }

}
