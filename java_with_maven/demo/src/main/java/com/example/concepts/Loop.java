package com.example.concepts;

public class Loop {

    public static void main(String[] args) {

        // Enhanced Loop (iterator)
        String [] names = {"James", "Larry", "Tom", "Lacy"};

        for( String name : names ) {
            System.out.print( name );
            System.out.print(",");
        }

        // while loop
        int x = 10;

        while( x < 20 ) {
            System.out.print("value of x : " + x );
            x++;
            System.out.print("\n");
        }
        
        // for loop
        for(int y = 10; y < 20; y = y + 1) {
            System.out.print("value of y : " + y );
            System.out.print("\n");
         }
        
        // do while
        int z = 10;

        do {
            System.out.print("value of z : " + z );
            z++;
            System.out.print("\n");
        } while( z < 20 );
        
    }
    
}
