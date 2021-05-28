package com.example.concepts;

public class IfStatement {

    public static void main(String args[]) {

        // if statement
        int x = 10;
  
        if( x < 20 ) {
           System.out.print("This is single if statement.");
        }

        // if else statement
        x = 30;

        if( x < 20 ) {
           System.out.print("This is if statement.");
        }
        else {
           System.out.print("This is else statement.");
        }

        // nested if statement
        x = 30;
        int y = 10;

        if( x == 30 ) {
            if( y == 10 ) {
                System.out.print("X = 30 and Y = 10");
            }
        }

        // switch statement (not used for comparisons)
        char grade = 'C';

        switch(grade) {
            case 'A' :
                System.out.println("Excellent!"); 
                break;
            case 'B' :
            case 'C' :
                System.out.println("Well done");
                break;
            case 'D' :
                System.out.println("You passed");
            case 'F' :
                System.out.println("Better try again");
                break;
            default :
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);


     }
    
}
