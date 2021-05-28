package com.example.concepts;

import java.io.*;
import java.rmi.RemoteException;

public class usingExceptions {

    // if method does not handle exception needs to be thrown again, can throw multiple
    public void deposit(double amount) throws RemoteException, Exception {
        // Method implementation
        if (amount > 10) {
            throw new RemoteException();
        }

        throw new Exception();
    }

    public static void tryWithRes() {

        // try with resources (like python open) automatically closes resources so no need for close()
        // class needs AutoCloseable interface and the close()
        try(FileReader fr = new FileReader("test.txt")) {
            char [] a = new char[50];
            fr.read(a);   // reads the contentto the array
            for(char c : a)
            System.out.print(c);   // prints the characters one by one
         } catch (IOException e) {
            e.printStackTrace();
         }
    }

    public static void main(String args[]) {
        // try and catch
        try {
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);

            //do sometthign else
            throw new IOException();

        } catch (ArrayIndexOutOfBoundsException e) { // A catch clause cannot exist without a try statement.
            System.out.println("Exception thrown  :" + e);
        } catch (IOException|ArrayStoreException ex) { // can have multiple catch blocks
            System.out.println("Exception thrown  :" + ex);
        } finally {
            // The finally block always executes.
         }
        System.out.println("Out of the block");

        tryWithRes();
    }

}
