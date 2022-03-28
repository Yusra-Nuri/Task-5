package com.company.main;

import java.util.Scanner;

public class ConcatenatingStrings {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Kindly enter the first word you want to concatenate");
        String UserInput = scan.nextLine();
        System.out.println("Kindly enter the second word you want to concatenate");
        String UserInput2 = scan.nextLine();


        System.out.println(UserInput +" "+ UserInput2);
        System.out.println(UserInput2 +" " + UserInput);

        if(UserInput.equals(UserInput2)) {
            System.out.println("Your concatenation is okay");
        }
            else {
            System.out.println("Your concatenation isn't okay");
        }
            }
        }








