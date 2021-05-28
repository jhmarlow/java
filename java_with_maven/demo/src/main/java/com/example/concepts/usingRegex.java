package com.example.concepts;

import java.util.regex.*;
// primarily consists of pattern, matcher, patternsyntaxexception

public class usingRegex {
    private static String REGEX = "dog";
    private static String INPUT = "The dog says meow. " + "All dogs say meow.";
    private static String REPLACE = "cat";

    public static void main(String[] args) {
        // String to be scanned to find the pattern.
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(.*)(\\d+)(.*)";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(line);
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) ); // whole expression
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
        }else {
            System.out.println("NO MATCH");
        }
     
        Pattern p = Pattern.compile(REGEX);
        
        // get a matcher object
        Matcher m1 = p.matcher(INPUT); 
        System.out.println(INPUT);
        INPUT = m1.replaceAll(REPLACE);
        System.out.println(INPUT);
            
    }
    
}
