
package javastreams;

import java.util.ArrayList;
import java.util.function.Supplier;

public class TheCollector {

    public static void main(String args[]){
        
        Runnable run = () -> {System.out.println("This is Kiran");};
        
        // using a lambda expression.
        Supplier<ArrayList<String>> supplier =  () -> new ArrayList<>();
        
        
    }
}
