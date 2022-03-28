package com.company.main;

import java.util.Random;

public class MinAndMax {

        public static void main(String[] args) {
            int min = 0, max = 100;

            //creating random numbers from 1 to 100
            System.out.println("Hey You, it's nice to see you here :)");
            System.out.println("Here are random numbers from 1 to 100");
            System.out.println();

            Random ran = new Random();
            int array []= new int[10];

            for (int i = 0; i < array.length; i++) {
                array[i] = ran.nextInt(1, 100);
                System.out.println(array[i]);

            // finding min n max using loop
                if (min < array[i])
                    min = array[i];
                if (max > array[i])
                    max = array[i];
            }
            System.out.println(" ");
            System.out.println("Here we have the minimum: " + min);
            System.out.println("And here we have the maximum: " + max);
        }
}
