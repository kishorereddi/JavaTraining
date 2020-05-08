package com.training.week1.day3;

public class AnonymousArray {
   public static void main(String args[]) {
      annArray(new int[] {1,2,3,4,5,6});
   }

   public static void annArray(int [] array) {
      for(int i=0; i< array.length; i++) {
         System.out.println(i);
      }
   }

}