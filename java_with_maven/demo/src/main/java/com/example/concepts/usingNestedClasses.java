package com.example.concepts;

abstract class AnonymousInner {
    public abstract void mymethod();
}

class Outer_Demo {
    int num;

    // private variable of the outer class
    private int num1 = 175;
    int num2 = 175;
    
    // inner class
    private class Inner_Demo {
       public void print() {
          System.out.println("This is an inner class");
       }
    }
    
    // Accessing he inner class from the method within
    void display_Inner() {
       Inner_Demo inner = new Inner_Demo();
       inner.print();
    }

    void my_Method() {
        num = 23;

        // method-local inner class
        // A method-local inner class can be instantiated only within the method where the inner class is defined
        // like local var
        class MethodInner_Demo {
            public void print() {
                System.out.println("This is method inner class "+num);	   
            }
        } // end of inner class
        
        // Accessing the inner class
        MethodInner_Demo inner = new MethodInner_Demo();
        inner.print();
        }
    }

public class usingNestedClasses {
    // when a class is declared within itself. 
    // This is typically used for security, so you can declare the 
    // class as private an make it unreachable from outstide the class.

    static class Nested_Demo {
        // static nested class, don't need to instantiate
        public void my_method() {
           System.out.println("This is my nested class");
        }
     }
    
    public static void main(String args[]) {
        // Instantiating the outer class 
        Outer_Demo outer = new Outer_Demo();
        int x = outer.num2;
        // int y = outer.num1; // not visible
        // Accessing the display_Inner() method.
        outer.display_Inner();
        
        // this below throws error as not visible
        // Outer_Demo outer1 = new Outer_Demo();
        // Outer_Demo.Inner_Demo inner = outer1.new Inner_Demo();

        // anonymous inner 
        // In case of anonymous inner classes, we declare and instantiate them at the same time.
        AnonymousInner inner = new AnonymousInner() {
            public void mymethod() {
               System.out.println("This is an example of anonymous inner class");
            }
        };
        inner.mymethod();

        // can also pass anonymous inner class as argument
        // obj.my_Method(new My_Class() {
        //     public void Do() {
        //        .....
        //        .....
        //     }
        //  });


        // instantiate static nested class
        usingNestedClasses.Nested_Demo nested = new usingNestedClasses.Nested_Demo();	 
        nested.my_method();
    }
    
}

