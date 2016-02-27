
package javastreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileStreams {

    public static void main(String args[]){
        
        System.out.println("In the Main Method");
        readFileContents("/home/kiran/two.c");
        
        System.out.println("Listing the home directory");
        listDirectory();
    }
    
    public static void readFileContents(String filePath){
        Path path = Paths.get(filePath);
        
        if(!Files.exists(path)){
            System.out.println("The file "+path.toAbsolutePath() + "is not a file");
            return;
        }
        
        try(Stream<String> lines = Files.lines(path)){
            lines.forEach(System.out::println);
        }catch(IOException exception){
            exception.printStackTrace();
        }
    }
    
    public static void listDirectory(){
     
        Path path = Paths.get("/home/kiran");
        
        System.out.println("The Absolute path is "+path.toAbsolutePath());
        
        try(Stream<Path> dirs = Files.walk(path,1)){
            dirs.forEach(System.out::println);
        }catch(IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
