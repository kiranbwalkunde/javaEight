
package inputoutput;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.Reader;

public class Pipings {
    
    public static void main(String args[]) throws Exception{
        
        PipedInputStream pis = new PipedInputStream(10);
        PipedOutputStream pos = new PipedOutputStream();

        
        Runnable produce = () -> produceData(pos);
        Runnable consume = () -> consumeData(pis);

        
        Thread produceThread = new Thread(produce);
        Thread consumeThread = new Thread(consume);
        
        produceThread.start();
              pos.connect(pis);
        consumeThread.start();
          
    }
    
    public static void produceData(PipedOutputStream pos){
            
        try{
            for(int i=1;i<=50;i++){
                pos.write((byte)i);
                pos.flush();
                System.out.println("Writing : "+i);
        //        Thread.sleep(500);
            }
            pos.close();
        }catch(IOException e ){
            System.out.println(e.getMessage());
        }
        
    }
    
    public static void consumeData(PipedInputStream pis){
        
            try{
                 int num = -1;
                 while((num = pis.read())!=-1){
                     System.out.println("Reading : "+num);
                     Thread.sleep(500);
                 }
                 pis.close();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
    }
}
