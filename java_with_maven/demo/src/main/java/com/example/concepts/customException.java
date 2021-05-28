package com.example.concepts;

// File Name customException.java
import java.io.*;

public class customException extends Exception {
   private double amount;
   
   public customException(double amount) {
      this.amount = amount;
   }
   
   public double getAmount() {
      return amount;
   }
}
