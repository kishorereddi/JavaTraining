package com.training.flowcontrol;

import java.io.PrintStream;

class ContinueDemo {
   public static void main(String[] args) {
      //Requirement: print only 1, 2, 3, 4 and 9,10
      for (int i = 1; i <= 10; ++i) {      
         if (i > 4 && i < 9) {
            continue;
            //
         }      
         System.out.println(i);
      }   
   }
}
