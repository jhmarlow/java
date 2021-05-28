package com.example.concepts;

public class usingInstances {
    // Instance variable num
    int num = 10;
    
    // class variable
    private static double salary;
     
    usingInstances() {
       System.out.println("This is an example program on keyword this");	
    }
 
    usingInstances(int num) {
       // Invoking the default constructor
       this();
       
       // Assigning the local variable num to the instance variable num
       this.num = num;	   
    }
    //test
    public void greet() {
       System.out.println("Hi Welcome to Tutorialspoint");
    }
       
    public void print() {
       // Local variable num
       int num = 20;
       
       // Printing the local variable
       System.out.println("value of local variable num is : " + num);
       
       // Printing the instance variable
       System.out.println("value of instance variable num is : " + this.num);
       
       // Invoking the greet method of a class
       this.greet();     
    }
    
    public static void main(String[] args) {
       // Instantiating the class
       instances obj1 = new usingInstances();
       
       // Invoking the print method
       obj1.print();
       
       // Passing a new value to the num variable through parametrized constructor
       instances obj2 = new usingInstances(30);
       
       // Invoking the print method again
       obj2.print(); 
    }
 }
