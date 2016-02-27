/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archives;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/**
 * To write checksum string to file and read the same.
 *
 * @author kiran
 */
public class ReadingWritingInflateDeflate {

    public static void main(String args[]) throws IOException, DataFormatException {

        final String stringValue = "This is the sample text to write to a file.";
        final String fileName = "checksumed.dat";

        // Writing to the file. 
        deflate(stringValue, fileName);

        //Reading from the file.
        inflate(fileName);
    }

    /**
     * Method to write checksum content to the file.
     *
     * @param stringValue the String checksum value to write to a file
     * @param fileName the file to which the content to be written
     */
    public static void deflate(final String stringValue, final String fileName) throws IOException {

        FileOutputStream fout = new FileOutputStream(fileName);
        Deflater deflate = new Deflater(Deflater.DEFAULT_COMPRESSION,true);
        deflate.setInput(stringValue.getBytes());
        deflate.finish();
        byte[] bytes = new byte[1024];
        int count = deflate.deflate(bytes);
        deflate.end();
        System.out.println("The number of bytes are :" + count);
        System.out.println("The checksumed bytes are : " + new String(bytes));
        fout.write(bytes);
        fout.flush();
        fout.close();
    }

    /**
     * Method to read checksum data from a file.
     *
     * @param fileName
     * @throws java.io.IOException
     * @throws java.util.zip.DataFormatException
     */
    public static void inflate(final String fileName) throws IOException, DataFormatException {

        FileInputStream fin = new FileInputStream(fileName);
        byte[] bytes = new byte[1024];
        fin.read(bytes);
        Inflater inflate = new Inflater(true);
        inflate.setInput(bytes);
        byte[] byteValues = new byte[1024];
        inflate.inflate(byteValues);
        inflate.end();
        System.out.println("The values are : " + new String(byteValues));
    }
}
