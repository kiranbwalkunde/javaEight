package inputoutput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamInJava {

    public static void main(String args[]) {

        System.out.println("Writing to a file...");
        writingToFile();
        System.out.println("Reading from a file...");
        readingFromFile();

        System.out.println("The line separator is :- " + System.getProperty("line.separator"));

    }

    public static void readingFromFile() {

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("sample.c"))) {

            byte[] bytes = new byte[200];
            bis.read(bytes);
            System.out.println("The data is :- " + new String(bytes));

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

    }

    public static void writingToFile() {

        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("sample.c"))) {

            out.write("Kiran Baburao Walkunde".getBytes());
            out.flush();

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
