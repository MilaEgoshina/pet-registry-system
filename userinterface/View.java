package Final.userinterface;

import java.util.List;

public interface View<T> {

    public String getUserName();
    public String getUserDate();
    public <V> void printAllAnimals(List<V> collection,Class<V> myClass); 
    public void showMessage(String msg);
    
}
