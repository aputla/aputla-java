package effective.lava.item01;

public class BeforeExample {
    private static class Boolean {
        private final boolean value;
        public Boolean(boolean value) {
            this.value = value;
        }
    }
    
    public static void main(String[] args) {
        Boolean b = new Boolean(false);
    }
}
