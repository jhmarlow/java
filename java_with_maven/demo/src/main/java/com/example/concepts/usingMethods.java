package com.example.concepts;

public class usingMethods {

    public static void methodRankPoints(double points) {
        if (points >= 202.5) {
        System.out.println("Rank:A1");
        }else if (points >= 122.4) {
        System.out.println("Rank:A2");
        }else {
        System.out.println("Rank:A3");
        }
    }

    public static void swapFunction(int a, int b) {
        System.out.println("Before swapping(Inside), a = " + a + " b = " + b);
        
        // Swap n1 with n2
        int c = a;
        a = b;
        b = c;
        System.out.println("After swapping(Inside), a = " + a + " b = " + b);
    }

    // method overloading for integer
    public static int minFunction(int n1, int n2) {
        int min;
        if (n1 > n2)
        min = n2;
        else
        min = n1;

        return min; 
    }
 
    // method overloading for double
    public static double minFunction(double n1, double n2) {
    double min;
        if (n1 > n2)
        min = n2;
        else
        min = n1;

        return min; 
    }

    // variable length arguments uses "...", must come at end. only one per method
    public static void printMax( double... numbers) {
        if (numbers.length == 0) {
           System.out.println("No argument passed");
           return;
        }
  
        double result = numbers[0];
  
        for (int i = 1; i <  numbers.length; i++)
        if (numbers[i] >  result)
        result = numbers[i];
        System.out.println("The max value is " + result);
    }

     public static void main(String[] args) {

        int res = minFunction(1, 2);
        System.out.print(res);
        System.out.print("\n");

        methodRankPoints(255.7);

        int a = 30;
        int b = 45;
        System.out.println("Before swapping, a = " + a + " and b = " + b);

        // Invoke the swap method
        swapFunction(a, b);
        System.out.println("\n**Now, Before and After swapping values will be same here**:");
        System.out.println("After swapping, a = " + a + " and b is " + b);

        a = 11;
        b = 6;
        double c = 7.3;
        double d = 9.4;
        int result1 = minFunction(a, b);
        
        // same function name with different parameters
        double result2 = minFunction(c, d);
        System.out.println("Minimum Value = " + result1);
        System.out.println("Minimum Value = " + result2);

        printMax(34, 3, 3, 2, 56.5);
    }

    protected void finalize( ) {
        // finalization code here
        System.out.println("ran as part of garbage collection to clean up");
     }
    
}
