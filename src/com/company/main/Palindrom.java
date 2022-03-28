package com.company.main;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args){

        System.out.println("Welcome to UC's Corner! \nI hope you will have a great time here :)");
        System.out.println("Kindly enter the word you want to check if it's a palindrome or not: ");
        String reverse = "";
        Scanner scan = new Scanner(System.in);
        String UserInput = scan.nextLine();
        System.out.println(UserInput.toLowerCase());

        for(int i = UserInput.length() - 1; i>=0; i--){
            reverse += UserInput.charAt(i);
            System.out.println(reverse);
        }
        
        boolean palindrome = true;
        for(int i=0; i<UserInput.length(); i++){
            if(UserInput.charAt(i) != reverse.charAt(i)){
                palindrome = false;
            }
        }
        if(palindrome) {
            System.out.println("The word you entered is a PALINDROME!");
        }
        else{
            System.out.println("The word you entered is NOT PALINDROME!");
        }
        System.out.println("I am glad you used my system :)");
    }
}
