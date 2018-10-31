package chengang.com.chapter3;

/*
Provide an interface Measurable with a method double getMeasure() that measures an object in some way. Make Employee
implement Measurable. Provide a method double average(Measurable[] objects) that computes the average measure. Use it to
compute the average salary of an array of employees.
 */
public class Ex1 {
    double average(Measurable[] objects) {
        double sum = 0.0;
        for (Measurable object:  objects) {
            sum += object.getMeasure();
        }
        return sum / objects.length;
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new Employee("bob", 10.1),
                new Employee("doris", 10.9)
        };
        Ex1 ex1 = new Ex1();
        System.out.println(ex1.average(employees));
    }
}
