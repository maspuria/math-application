package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Step 1
        // Question 1
        // Create two variables for Bob and Gary's salary
        double bobSalary = 80_000.00;
        double garySalary = 100_000.00;
        System.out.println("Bob has a salary of " + "$" + bobSalary + " and Gary has a salary of " + "$" + garySalary);
        // Create a new variable named highestSalary using Math.max()
        // store the answer in highestSalary
        double highestSalary = Math.max(bobSalary, garySalary);
        // Print the answer "The highest salary is..."
        System.out.println("The highest salary is " + highestSalary);
        // Question 2
        // Find and display the smallest of two variables named carPrice and truckPrice
        // set the variables to any value you want
        double carPrice = 34_000.99;
        double truckPrice = 40_000.99;
        double lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is " + lowestPrice);
        // Question 3
        // Find and display the area of a circle whose radius is 7.25
        double radius = 7.25;
        double area = Math.PI * (radius * radius);
        System.out.println("The Area of the circle is " + area);
        // Question 4
        // find and display the square root a variable after it is set to 5.0
        double num = 5.0;
        double squareRoot = Math.sqrt(num);
        System.out.println("The square root of 5.0 is " + squareRoot);
        // Question 5
        // Find and display the distance between two points (5,10) and (85,50)
        double a1 = 5;
        double b1 = 10;
        double a2 = 85;
        double b2 = 50;
        // to find the square root use Math.sqrt
        // to find the power of a number use Math.pow(x,2)
        double distance = Math.sqrt(Math.pow(a2-a1,2) + Math.pow(b2-b1,2));
        System.out.println("The distance between (5,10) and (85,50) is " + distance);
        // Question 6
        // Find the absolute (positive) value of a variable after it is set to -3.8
        // identify the variable
        double number = -3.8;
        // use Math.abs to find the absolute value of a number
        double absoluteValue = Math.abs(number);
        // solution
        System.out.println("The absolute value of -3.8 is " +  absoluteValue);
        // Question 7
        // Find a random number between 0 and 1
        // use Math.random() because it randomizes a number between 0 and 1
        // if you wanted to extend the number 1 to any number then you would multiply by that number
        // Ex: Math.random() * anyNumber
        double randomNumber = Math.random();
        System.out.println("A random number between 0 and 1 is " + randomNumber);





    }
}
