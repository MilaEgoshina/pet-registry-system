package Final.controller;

public class Counter implements AutoCloseable{

    public static int count;

    {
        count = 0;
    }

    public void add(){
        count++;
    }

    @Override
    public void close() throws Exception {
        
        System.out.println("Counter closed");
    }
    
}
