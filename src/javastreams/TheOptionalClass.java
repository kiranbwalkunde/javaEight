
package javastreams;

import java.time.LocalDate;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class TheOptionalClass {

    public static void main(String args[]){
        
        System.out.println("The intStreams is ±");
        intStreams();
    }
    
    public static void intStreams(){
        int ints = IntStream.rangeClosed(1, 5).map(x -> x*3).reduce(0,Integer::sum);
    }
    
    public static void sampleOptional(){
         Person p = new Person(1,"Kiran",Person.Gender.MALE,null,10000);
        Optional<LocalDate> birth = Optional.ofNullable(p.getDob());
        
        if(birth.isPresent()){
            System.out.println("Birth Date is valid...");
        }else{
            System.out.println("Birth Date is not Valid...");
        }
    }
}
