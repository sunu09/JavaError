package com.tts;

import java.util.Scanner;

public class Main {
//
    public static void main(String[] args) {
        // write your code here'
//        System.out.println( "Hello Java");
//        System.out.print("Hi");
//        System.out.print("Hey");
        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = input.nextLine();
        System.out.printf("Hello %s!\n", firstName);
        System.out.println("What is your last name");
        String lastName = input.nextLine();
        System.out.printf("your name is %s %s.\n", firstName, lastName);

        System.out.println("Enter a name: ")
        String name = input.nextLine();
        System.out.println("Give me an adverb: ");
        String adverb = input.nextLine();
        System.out.println("Give me a adjective: ");
        String adjective = input.nextLine();
        System.out.println("Give me a verb: ");
        String verb = input.nextLine();
        System.out.println("Give me a noun two: ");
        String nounTwo = input.nextLine();
        System.out.println("Give me a number: ");
        String number = input.nextLine();
        System.out.println("Give me your name: ");
        String yourName = input.nextLine();
        System.out.printf("Here is your story: \n");
        System.out.printf("\n Dear %s,", name);
        System.out.printf("\n You are %s %s and I want to be your %s!", adverb, adjective, verb);
        System.out.printf("\n I want to go to the %s with you in %s days.", nounTwo, number);
        System.out.printf("\n Sincerely, %s \n", yourName);
            }
        }



