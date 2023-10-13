package Final.Controller;

public class Counter implements AutoCloseable{

    public static int count;

    @Override
    public void close() throws Exception {
        
        System.out.println("Counter closed");
    }
    
}
