package lava.util.regex.matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindExample {
    public static void main(String[] args) {
        String text = "hello is followed by world";
        String pattern = "(hello)(.*)(world)";
        
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        
        if (m.find()) {
            System.out.println("group(0)=" + m.group(0));
            System.out.println("group(1)=" + m.group(1));
            System.out.println("group(2)=" + m.group(2));
            System.out.println("group(3)=" + m.group(3));
        } else {
            System.out.println("Doesn't match");
        }
    }
}
