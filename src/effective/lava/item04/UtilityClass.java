package effective.lava.item04;

public final class UtilityClass {
    private UtilityClass() {
        throw new AssertionError();
    }
    
    public static void saySomething() {
        System.out.println("something");
    }
}
