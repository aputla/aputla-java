package lava.util.stream.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
    
    private static class Employee {
        private final String name;
        private final String department;
        
        public Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }
        
        public String getDepartment() {
            return department;
        }
        
        @Override
        public String toString() {
            return name;
        }
    }
    
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Foo", "A"),
                new Employee("Bar", "A"),
                new Employee("Tom", "B")
                );
        Map<String, List<Employee>> group = list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(group);
    }
}
