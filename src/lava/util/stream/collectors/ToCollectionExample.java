package lava.util.stream.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ToCollectionExample {
    
    private static class Person {
        private final String name;
        private final int age;
        
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        public String getName() {
            return name;
        }
    }
    
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("Foo", 35),
                new Person("Bar", 30),
                new Person("Tom", 30)
                );
        Set<String> nameList = list.stream()
                .map(Person::getName)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(nameList);
    }
}
