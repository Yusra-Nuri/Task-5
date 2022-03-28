package com.company.main;
import java.util.Arrays;

public class Array {
    public static void main(String[] args)
    {
     int [] num =new int[10];

        // classic loop with .length method
        // Arrays.fill(num, num.length);
     for(int i =0; i<num.length; i++)
     {
      num[i] = num.length-1-i;
     }
       // for each as a second loop
      for (int c:num)
      {
      System.out.println("array [" + c + "]:" + num[c]);
      }
    }
}




