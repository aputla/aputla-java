package general.lambdas.examples;

import java.util.Comparator;

public class BeforeLambda {
    private interface Command {
        void invoke();
    }
    
    public static void main(String[] args) {
        Command print = new Command() {
            @Override
            public void invoke() {
                System.out.println("hello world");
            }
        };
        print.invoke();
        
        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(c.compare("1", "2"));
    }
}
