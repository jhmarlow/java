package com.example.concepts;


class NoParamConstruc {
    int num;

    NoParamConstruc() {
       num = 100;
    }
 }

// A simple constructor.
class ParamConstruc {
    int x;
    
    // Following is the constructor
    ParamConstruc(int i ) {
       x = i;
    }
 }

public class usingConstructor {

    // INSTANCE VARIABLES
    int a, b, c;         // Declares three ints, a, b, and c. defaults to 0     
    int d = 10, e = 10;  // Example of initialization

    // this instance variable is visible for any child class.
    public String name; // defaults to null

    // salary  variable is visible in Employee class only.
    private double salary = 20.00;

    // STATIC VARIABLES (constants)
    // salary  variable is a private static variable
    private static double fee;
    // DEPARTMENT is a constant
    public static final String DEPARTMENT = "Development ";

    public void instVar() { // add static to make static method e.g. call directly no need to init
        // instance values cannot be accessed by static methods
        System.out.println("Salary age is : " + salary);
    }

    public void localVar() { // add static to make static method e.g. call directly no need to init
        // LOCAL VARIABLES: will be destroyed when method exists (this doesnt default and will fail if not decalred)
        int age = 0; 
        age = age + 7;
        System.out.println("Puppy age is : " + age);
    }

    public static void main(String[] args) {
        NoParamConstruc t1 = new NoParamConstruc(); 
        ParamConstruc t2 = new ParamConstruc(10);

        usingConstructor t3 = new usingConstructor();
        t3.localVar();

        t3.instVar();

        System.out.println("No param: \n " + t1.num + " Param:" + t2.x);
        System.out.println(DEPARTMENT);
        fee = 10;
        System.out.println(fee);

    }
    
}
