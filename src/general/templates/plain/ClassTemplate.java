package general.templates.plain;

import java.util.Comparator;
import java.util.Objects;

class Employee implements Comparable<Employee> {
    
    private final String name;
    private final int age;
    
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    @Override
    public String toString() {
        return "Employee {" +
                   "name=" + Objects.toString(name) + ", " +
                   "team=" + Objects.toString(age) +
               "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Employee)) {
            return false;
        }

        Employee other = (Employee) obj;
        return Objects.equals(name, other.name) &&
               Objects.equals(age,  other.age);
    }

    @Override
    public int compareTo(Employee other) {
        return Comparator
                .comparing(Employee::getName)
                .thenComparing(Employee::getAge)
                .compare(this, other);
    }
}

public class ClassTemplate {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Anil", 10);
        Employee emp2 = new Employee("Anil", 10);
        System.out.println(emp1.compareTo(emp2));
    }
}
