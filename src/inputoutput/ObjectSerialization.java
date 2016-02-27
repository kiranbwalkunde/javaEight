
package inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import javastreams.Person;

public class ObjectSerialization {
    
    /**
     * Main method for the Class.
     * @param args
     */
    public static void main(String args[]) throws Exception{
        
        Person person = new Person();
        person.setDob(LocalDate.now());
        person.setGender(Person.Gender.MALE);
        person.setId(3);
        person.setIncome(10000);
        person.setName("Kiran");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object.dat"));
        writeToFile(out,person);
        readFromFile();
    }
    
    /**
     * Method to write Object to a File.
     * @param out
     * @param person
     */
    public static void writeToFile(ObjectOutputStream out, Person person) throws Exception{

        out.writeObject(person);
        out.flush();
        out.close();
    }
    
    /**
     * The method to read Object from a file.
     */
    public static void readFromFile(){
        
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.dat"))){
            
            Person person = (Person) in.readObject();
            System.out.println("Person Name "+ person.getName());
            System.out.println("Person Id "+person.getId());
            System.out.println("Person Date Of Birth "+person.getDob());
            System.out.println("Person Income "+person.getIncome());
            System.out.println("Person Sex "+person.getGender());
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
