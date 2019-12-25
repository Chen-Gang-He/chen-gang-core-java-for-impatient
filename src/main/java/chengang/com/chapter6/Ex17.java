package chengang.com.chapter6;

import org.apache.logging.log4j.util.Strings;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(@NotNull Employee o) {
        return Integer.compare(id, o.id);
    }

    @Override
    public String toString() {
        return String.format("id=[%d], name=[%s]", id, name);
    }
}

public class Ex17 {


    public static void main(String[] args) {
        // Ex17 ex17 = new Ex17();
        Employee[] employees = {new Employee(1, "chengang"), new Employee(2, "John")};
        Arrays.sort(employees);
        System.out.println(String.format("employee=[%s]", Arrays.toString(employees)));
        System.out.println("Bridge method compareTo(Object o) {compareTo(Employee o)} will be compiled. " +
                "called in runtime and it would call overridden compareTo method");

        // public int compareTo(chengang.com.chapter6.Employee);
        // descriptor: (Lchengang/com/chapter6/Employee;)I
        // flags: ACC_PUBLIC
        // Code:
        // stack=2, locals=2, args_size=2
        // 0: aload_0
        // 1: getfield      #2                  // Field id:I
        // 4: aload_1
        // 5: getfield      #2                  // Field id:I
        // 8: invokestatic  #4                  // Method java/lang/Integer.compare:(II)I
        // 11: ireturn
        // LineNumberTable:
        // line 21: 0
        // LocalVariableTable:
        // Start  Length  Slot  Name   Signature
        // 0      12     0  this   Lchengang/com/chapter6/Employee;
        // 0      12     1     o   Lchengang/com/chapter6/Employee;
        // RuntimeInvisibleTypeAnnotations:
        // 0: #29(): METHOD_FORMAL_PARAMETER, param_index=0
        // RuntimeInvisibleParameterAnnotations:
        // 0:
        // 0: #29()

        // public int compareTo(java.lang.Object);
        // descriptor: (Ljava/lang/Object;)I
        // flags: ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
        // Code:
        // stack=2, locals=2, args_size=2
        // 0: aload_0
        // 1: aload_1
        // 2: checkcast     #9                  // class chengang/com/chapter6/Employee
        // 5: invokevirtual #10                 // Method compareTo:(Lchengang/com/chapter6/Employee;)I
        // 8: ireturn
        // LineNumberTable:
        // line 7: 0
        // LocalVariableTable:
        // Start  Length  Slot  Name   Signature
        // 0       9     0  this   Lchengang/com/chapter6/Employee;
        // RuntimeInvisibleTypeAnnotations:
        // 0: #29(): METHOD_FORMAL_PARAMETER, param_index=0
        // RuntimeInvisibleParameterAnnotations:
        // 0:
        // 0: #29()

    }

}
