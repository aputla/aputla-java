package general.features.all;

interface Command {
    void invoke();
    
    default void say() {
        System.out.println("hello world");
    }
}

public class VirtualExtensionForInterface {
    public static void main(String[] args) {
        Command command = () -> System.out.println("command");
        command.say();
    }
}
