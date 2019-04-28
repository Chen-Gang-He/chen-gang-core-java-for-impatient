package chengang.com.chapter4;

/*
Make the instance variables x and y of the Point class in Exercise 1 protected. Show that the LabeledPoint class can
access these variables only in LabeledPoint instances.
 */

public class Ex3 {

    public static void main(String[] args) {
        LabeledPoint labeledPoint = new LabeledPoint("One", 1.2, 2.1);
        System.out.println(labeledPoint.x); //x protected is accessible since Ex3 hosts in same package with Point and
        // its subclass
        // protected field can not be accessed by any non-Point class outside the same package
        // TestChap4Ex3.main(["Tesx"]);


    }
}
