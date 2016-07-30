package effective.lava.item03;

public class SingletonExample03 {
    private static enum Elvis {
        INSTANCE;
        
        private Elvis() {
            System.out.println("Create");
        }
    }
    
    public static void main(String[] args) {
        Elvis one = Elvis.INSTANCE;
        Elvis two = Elvis.INSTANCE;
    }
}
