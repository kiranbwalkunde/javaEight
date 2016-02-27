package inputoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CurrentWorkingDir {

    public static void main(String args[]) 
    {

    }

    public static void gettingCurrentDir() {
        String stringDir = System.getProperty("user.dir");
        System.out.println("The current Working Dir is : " + stringDir);
    }

    public static void readingClosing() {
        File file = new File("tempFile.c");
        file.deleteOnExit();
        if (!file.exists()) {
            boolean create = false;
            try {
                create = file.createNewFile();
            } catch (IOException exception) {
                System.out.println("Exception : " + exception.getMessage());
            }
            if (create) {
                String fileName = file.getName();
                System.out.println("The file Name is :- " + fileName);
            }

            long length = file.length();

            System.out.println("The length of the File is : " + length);

            file.deleteOnExit();
        }
    }

}
