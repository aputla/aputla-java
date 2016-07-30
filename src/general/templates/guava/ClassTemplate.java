package general.templates.guava;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.ComparisonChain;

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
        return MoreObjects.toStringHelper(this)
                          .add("name", name)
                          .add("age", age)
                          .toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name, age);
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
        return Objects.equal(name, other.name) &&
               Objects.equal(age,  other.age);
    }

    @Override
    public int compareTo(Employee other) {
        return ComparisonChain.start()
                .compare(age, other.age)
                .compare(name, other.name)
                .result();
    }
}

public class ClassTemplate {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Anil", 10);
        Employee emp2 = new Employee("Anil", 10);
        System.out.println(emp1.compareTo(emp2));
    }
}
