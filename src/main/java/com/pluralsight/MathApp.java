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

    }
}
