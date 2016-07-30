package lava.util.stream.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SummingIntExample {
    
    private static class Employee {
        private final String name;
        private final int salary;
        
        public Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }
        
        public int getSalary() {
            return salary;
        }
    }
    
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Foo", 80),
                new Employee("Bar", 100),
                new Employee("Tom", 20)
                );
        int totalSalary = list.stream().collect(Collectors.summingInt(Employee::getSalary));
        System.out.println(totalSalary);
    }
}
