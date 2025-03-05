import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}

public class EmployeeSortLambda {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 24, 40000));
        employees.add(new Employee("Bob", 35, 50000));
        employees.add(new Employee("Charlie", 55, 65000));
        employees.add(new Employee("David", 30, 80000));

        System.out.println("Original List of Employees:");
        employees.forEach(System.out::println);

        Collections.sort(employees, (e1, e2) -> e1.name.compareTo(e2.name));

        System.out.println("\nList of Employees sorted by Name:");
        employees.forEach(System.out::println);

        Collections.sort(employees, (e1, e2) -> Integer.compare(e1.age, e2.age));

        System.out.println("\nList of Employees sorted by Age:");
        employees.forEach(System.out::println);

        Collections.sort(employees, (e1, e2) -> Double.compare(e1.salary, e2.salary));

        System.out.println("\nList of Employees sorted by Salary:");
        employees.forEach(System.out::println);
    }
}
