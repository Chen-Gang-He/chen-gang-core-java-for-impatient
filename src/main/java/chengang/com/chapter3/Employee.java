package chengang.com.chapter3;

class Employee implements Measurable{
    private String name;
    private double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    Employee() {
        this("", 0.0);
    }

    String getName() {
        return toString();
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Salary: %.2f", name, salary);
    }

    @Override
    public double getMeasure() {
        return this.salary;
    }


}
