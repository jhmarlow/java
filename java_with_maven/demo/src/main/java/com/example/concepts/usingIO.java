package com.example.concepts;

import java.io.*;

public class usingIO {


    public static void copyByteFile() throws IOException {

        // reads/writes 1 byte at a time

        FileInputStream in = null;
        FileOutputStream out = null;
  
        try {
           in = new FileInputStream("input.txt");
           out = new FileOutputStream("output.txt");
           
           int c;
           while ((c = in.read()) != -1) {
              out.write(c);
           }
        } 
        finally {
           if (in != null) {
              in.close();
           }
           if (out != null) {
              out.close();
           }
        }

    }

   public static void copyCharFile() throws IOException {

      // reads/writes 2 bytes at a time

      FileReader in = null;
      FileWriter out = null;

      try {
         in = new FileReader("input.txt");
         out = new FileWriter("output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }

   public static void userInput() throws IOException {

      InputStreamReader cin = null;

      try {
         cin = new InputStreamReader(System.in);
         System.out.println("Enter characters, 'q' to quit.");
         char c;
         do {
            c = (char) cin.read();
            System.out.print(c);
         } while(c != 'q');
      }finally {
         if (cin != null) {
            cin.close();
         }
      }

  }



   public static void main(String args[]) throws IOException {
      // java provides 3 standard streams:
      // standard input
      // standard output 
      // standard error

      copyByteFile();
      copyCharFile();
      userInput();
   }
}
