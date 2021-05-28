package com.example.concepts;

import java.io.*;

public class usingFiles {

    public static void readWrite() {
        try {
            String[] arr = {"11", "21"};

            FileWriter writer = new FileWriter("test.txt");

            for(String str: arr) {
                writer.write(str);
              }

            writer.close();

            // reading
            FileReader input = new FileReader("test.txt");

            // Creates an array of character
            char[] array = new char[100];

            // Reads characters
            input.read(array);
            System.out.println("Data in the file: ");
            System.out.println(array);

            // Closes the reader
            input.close();

        } catch (IOException e) { 
            System.out.print("Exception");
            e.getStackTrace();}
    }

    public static void listDirs(){
        File file = null;
        String[] paths;
    
        try {      
            // create new file object
            file = new File("src/main/java/com/example/concepts");

            // array of files and directory
            paths = file.list();

            // for each name in the path array
            for(String path: paths) {
                // prints filename and directory name
                System.out.println(path);
            }
        } catch (Exception e) {
            // if any error occurs
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readWrite();
        listDirs();
    }
    
}
