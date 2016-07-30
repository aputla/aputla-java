package lava.util.function.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterExample {
    private static class Employee {
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
    }
    
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Foo", 35),
                new Employee("Bar", 30));
        Predicate<Employee> oldTimers = p -> p.getAge() > 32;
        employees.stream()
                 .filter(oldTimers)
                 .collect(Collectors.toList());
    }
}
