package effective.lava.item05;

public class StringExample01 {
    public static void main(String[] args) {
        // Avoid
        String s1 = new String("hello world");
        
        // Instead do
        String s2 = "hello world";
    }
}
