package com.example.examples;  // package statement

import java.io.*; //import statement

public class Puppy {

    private String puppyName; // variable declaration

    public Puppy(String name) { // constructor
       // This constructor has one parameter, name.
       puppyName = name; // set puppy name as instance var to be used later
       System.out.println("Passed Name is :" + name );
    }

    public static void main(String []args) {  //  main method
       // Following statement would create an object myPuppy
       Puppy myPuppy = new Puppy( "tommy" );
    }
 }
