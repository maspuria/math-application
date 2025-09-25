package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Step 1
        // Question 1
        // Create two variables for Bob and Gary's salary
        double bobSalary = 80_000.00;
        double garySalary = 100_000.00;
        // Create a new variable named highestSalary using Math.max()
        // store the answer in highestSalary
        double highestSalary = Math.max(bobSalary, garySalary);
        // Print the answer "The highest salary is..."
        System.out.println("The highest salary is " + highestSalary);
    }
}
