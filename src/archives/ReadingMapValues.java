/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package archives;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  This Program is to extract Map values from AEM image Map feature.
 * 
 * @author kiran
 */
public class ReadingMapValues {
    
    public static void main(String[] args) {
        
          String input = "[rect(1,2,3,4)\"abc.com\"|\"_self\"|\"alt text\"]"
                  + "[circle(4,5,6)\"cde.com\"|\"_blank\"|\"alternative text\"]"
                  + "[poly(4,5,6,7,8,9,0)\"abcde.com\"|\"_self\"|\"this is alternate\"]";
          
       //   System.out.println("The input is : "+input);
          // first splitting the string by [];
   
          String pattern = "([a-z]+)\\((.*)\\)\"(.*)\"\\|\"(.*)\"\\|\"(.*)\"";
          
          String[] arr = input.split("\\]\\[");
           
          Pattern p = Pattern.compile(pattern);
          
          List<String> maps = new ArrayList<String>();
          
          for(String a : arr){
              if(a.startsWith("[")){
                  a = a.substring(1, a.length());
              }
              
              if(a.endsWith("]")){
                  a = a.substring(0, a.length()-1);
              }
//              System.out.println(a);
          
              Matcher m = p.matcher(a);
            boolean b = m.matches();
            
            if(b){
                String list  = "area="+m.group(1)+" "+m.group(2)+" "+m.group(3)+" "+m.group(4)+" "+m.group(5); //+" "+m.group(6);
                maps.add(list);
                System.out.println(list);
            }
          }
    }
}

