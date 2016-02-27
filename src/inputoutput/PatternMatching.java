package inputoutput;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PatternMatching {

    public static void main(String args[]) {

//        Pattern p = Pattern.compile("\\[[a-z]*\\]");
//        Matcher m = p.matcher("[rect]");
//        boolean bool = m.matches();
//        int count = m.groupCount();
//        System.out.println("The Count is : " + count);
//        System.out.println("The Pattern Matches :" + bool);
//  
//        Pattern second = Pattern.compile("[\\(([0-9]*)\\)]*");
//        Matcher matcher = second.matcher("(123)(456)(789)");
//        boolean b = matcher.matches();
//        System.out.println("The pattern matches : "+b);
//        String count = matcher.group(0);
//        System.out.println("The count is : "+count);
//    
      
        
        
    }

    public static void stringSplit() {

        String inputs = "//[rect//]//[circle//]//[poly//]";

        String[] result = inputs.split("[[a-zA-z].*]");
        System.out.println("The result is : " + result.length);
        for (String a : result) {
            System.out.println(a);
        }
    }

    public static void samplePattern() {

        Pattern p = Pattern.compile("a*b");
        Matcher m = p.matcher("aaaaab");
        boolean bool = m.matches();
        System.out.println("The Pattern Matches :" + bool);

    }

    public static void squareBrackets() {

        Pattern p = Pattern.compile("\\[[0-9]*\\]");
        Matcher m = p.matcher("[1]");
        boolean bool = m.matches();
        int count = m.groupCount();
        System.out.println("The Count is : " + count);
        System.out.println("The Pattern Matches :" + bool);

    }
}
