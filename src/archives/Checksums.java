package archives;

import java.io.UnsupportedEncodingException;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import sun.misc.CRC16;

/**
 * Checking for Adler32 and CRC32 checksum values.
 *
 * @author kiran
 */
public class Checksums {

    public static void main(String args[]) {

    }

    public static void inflateDeflate() {
        
        Deflater compressor = new Deflater(Deflater.BEST_COMPRESSION, true);
        
        compressor.setInput("This is the data to compress".getBytes());
        compressor.finish();
        
    }

    public static void checkingChecksums() throws UnsupportedEncodingException {

        final String str = "HELLO";

        Adler32 adler = new Adler32();
        adler.update(str.getBytes("UTF-8"));

        CRC32 crc = new CRC32();
        crc.update(str.getBytes("UTF-8"));
        System.out.println("The checksum values for " + str + " is Adler : " + adler.getValue() + " crc :" + crc.getValue());
    }
}
