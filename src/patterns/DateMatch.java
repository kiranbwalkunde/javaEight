package patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateMatch {

    public static void main(String[] args) throws Exception {

        String map = "[rect(1,2,3,4)\"\"|\"\"|\"\"]";
        //   System.out.println("The map is : "+map);
        String abc = "[rect(1,2,3)\"optus\"|\"self\"|\"unable to load\"]";

       // for rectangle : "\\[([a-z]+())\\]"
        Pattern p = Pattern.compile("\\[([a-z]+)\\((.*)\\)\"(.*)\"\\|\"(.*)\"\\|\"(.*)\"\\]");

        Matcher m = p.matcher(abc);
        boolean b = m.matches();
        System.out.println(b);
        System.out.println("The group count is : " + m.groupCount());
        System.out.println(m.group(1));
        System.out.println(m.group(2));
        System.out.println(m.group(3));
        System.out.println(m.group(4));
        System.out.println(m.group(5));
    }

    public static void dateMatching() {
        String date = "12/30/1969";
        Pattern p
                = Pattern.compile("(\\d\\d)[-/](\\d\\d)[-/](\\d\\d\\d\\d)");
        Matcher m = p.matcher(date);
        if (m.find()) {
            String month = m.group(1);
            String day = m.group(2);
            String year = m.group(3);
            System.out.printf("Found %s-%s-%s\n", year, month, day);
        }
    }

}
