package chengang.com.chapter3;

/*
Continue with the preceding exercise and provide a method Measurable largest(Measurable[] objects). Use it to find the
name of the employee with the largest salary. Why do you need a cast?
 */
public class Ex2 {
    static Measurable largest(Measurable[] objects) {
        Measurable largest = objects[0];
        // Double current;
        for (Measurable object: objects) {
            if (object.getMeasure() >= largest.getMeasure()) {
                largest = object;
            }
        }
        return largest;
    }

    public static void main(String[] args) {

        Measurable[] company = {new Employee(),
                new Employee("bob", 100.2),
                new Employee("Doris", 999.2)
        };

        Measurable top = largest(company);
        System.out.printf("Employee with largest salary: %s", ((Employee) top).getName());

    }
}
