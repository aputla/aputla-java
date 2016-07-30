package effective.lava.item05;

public class BooleanExample01 {
    public static void main(String[] args) {
        // Avoid
        Boolean b1 = new Boolean(true);
        
        // Prefer
        Boolean b2 = Boolean.valueOf(true);
    }
}
