package effective.lava.item05;

public class IntegerExample01 {
    public static void main(String[] args) {
        // Avoid
        Integer s1 = 0;
        for (int i = 0; i < 10; i++) {
            s1 += i;
        }
        
        // Instead do
        int s2 = 0;
        for (int i = 0; i < 10; i++) {
            s2 += i;
        }
    }
}
