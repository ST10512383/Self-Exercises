package com.mycompany.scannerexercise;

import java.util.Scanner;


public class ScannerExercise {

    public static void main(String[] args) {
        
        // Display your name, age and height
        /*
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your name");
        String name = input.next();
        
        System.out.println("Please enter your age");
        int age = input.nextInt();
        
        System.out.println("Please enter your height");
        double height = input.nextDouble();
        
        System.out.println("Your name is " + name + " and you are " + age + " years old. " + "You are " + height + "m tall");
        */
        
        
        // Sum two values together
        /*
        Scanner valueIn = new Scanner(System.in);
        
        System.out.println("Enter your first value");
        int x = valueIn.nextInt();
        
        System.out.println("Enter your second value");
        int y = valueIn.nextInt();
        
        int z = x + y;
        
        System.out.println("The sum of your first and second value is: " + z);
        */
        
        // Calculate your BMI (Body Mass Index)
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("What is your height?");
        double height = userInput.nextDouble();
        double heightSquared = height * height;
        
        System.out.println("What is your weight?");
        int weight = userInput.nextInt();
        
        double bodyMassIndex = weight / heightSquared;
        
        System.out.println("Your BMI is: " + bodyMassIndex);
    }
}
