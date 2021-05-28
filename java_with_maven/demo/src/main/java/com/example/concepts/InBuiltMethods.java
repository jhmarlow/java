package com.example.concepts;
/** Represents an employee.
 * @author Doug Lowe
 * @author www.LoweWriter.com
 * @version 1.5
 * @since 1.0
*/

// java.util.Arrays class contains various static methods
import java.util.Arrays;
// this class encapsulates the current date and time.
import java.util.Date;

import java.util.*;
import java.text.*;

/** A class to hold tutorial learning.*/
public class InBuiltMethods {

    /** method to hold string code. */
    public static void stringMethods() {

        // String Class
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        System.out.println( "String Length is : " + len );

        // string compiler
        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
        String helloString = new String(helloArray);  
        System.out.println( helloString );
        
        // string concat
        
        System.out.println( helloString.concat(helloString) );

        System.out.println( "My name is ".concat("Zara"));
        System.out.println( "Hello," + " world" + "!");

        // formatted strings
        //%s string, %d int, %f float
        System.out.printf("The value of the float variable is " +
                  "%f, while the value of the integer %d", 10.0, 1);

        String fs;
        fs = String.format("The value of the string variable is " +
                        "%s " , helloString);
        System.out.println(fs);

        // example string methods
        String Str = new String("Welcome to Tutorialspoint.com");
        System.out.println(Str.replace('o', 'T'));
        System.out.println(Str.toLowerCase());
    }

    /** method to hold array code. */
    public static void arrayMethods() {

        // Declaring array
        // dataType[] arrayRefVar;   // preferred way.
        double[] myList5;   // preferred way.

        // Creating array
        // arrayRefVar = new dataType[arraySize];
        // dataType[] arrayRefVar = new dataType[arraySize];
        // dataType[] arrayRefVar = {value0, value1, ..., valuek};
        double[] myList1 = new double[10];

        double[] myList2 = {0.1, 0.2, 0.3};

        double[] myList = {1.9, 2.9, 3.4, 3.5};

        // Print all the array elements
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
        
        // Summing all elements
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Total is " + total);
        
        // Finding the largest element
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Max is " + max);  

    }

    public static int[] printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
           System.out.print(array[i] + " ");
        }

        return array;
     }

    /** method to hold array looping code. */
    public static void arrayUsage() {
        // arrays
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        // Print all the array elements
        for (double element: myList) {
            System.out.println(element);
        }

        int[] newArray = printArray(new int[]{3, 1, 2, 6, 4, 2});
        // java.util.Arrays class contains various static methods
        Arrays.sort(newArray); // sort array
        System.out.println(Arrays.toString(newArray));
    }

    /** method to hold date code. */
    public static void dateUsage() {

        Date date = new Date(); 
        long ms = date.getTime(); // obtain the number of milliseconds that have elapsed since midnight, January 1, 1970,
        System.out.println(date.toString()); // display time and date using toString()
        
        // date formatting
        Date dNow = new Date( );
        SimpleDateFormat ft = 
        new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Current Date: " + ft.format(dNow));

        // sleeping
        try { 
            System.out.println(new Date( ) + "\n"); 
            Thread.sleep(5*60*10); 
            System.out.println(new Date( ) + "\n"); 
         } catch (Exception e) {
            System.out.println("Got an exception!"); 
         }

    }

    /** Main method to call methods in class.
     * @param args generic args statement
     */
    public static void main(String[] args) {
        
        // using wrapper classes
        // Number Class
        Integer x = -1;
        Boolean status = x.equals(1);

        System.out.println(status.toString());

        Integer y = Math.abs(x);

        // Character Class
        System.out.println(y.toString());
        System.out.println(Character.toUpperCase('a'));

        stringMethods();
        arrayMethods();
        arrayUsage();
        dateUsage();

    }
}
