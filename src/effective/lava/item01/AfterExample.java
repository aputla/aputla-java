package effective.lava.item01;

public class AfterExample {
    private static class Boolean {
        private static final Boolean TRUE = new Boolean(true);
        private static final Boolean FALSE = new Boolean(false);
        
        private final boolean value;
        private Boolean(boolean value) {
            this.value = value;
        }
        
        // static factory method
        public static Boolean valueOf(boolean value) {
            return value ? Boolean.TRUE : Boolean.FALSE;
        }
    }
    
    public static void main(String[] args) {
        Boolean b = Boolean.valueOf(true);
    }
}
