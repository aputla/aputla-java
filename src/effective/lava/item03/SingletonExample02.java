package effective.lava.item03;

public class SingletonExample02 {
    private static class Elvis {
        public static final Elvis INSTANCE = new Elvis();
        private Elvis() {
            System.out.println("Create");
        }
        
        public static Elvis getInstance() {
            return INSTANCE;
        }
    }
    
    public static void main(String[] args) {
        Elvis one = Elvis.getInstance();
        Elvis two = Elvis.getInstance();
    }
}
