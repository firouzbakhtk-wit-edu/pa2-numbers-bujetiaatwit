package edu.wit.cs.comp1000;
import java.util.Scanner;
// TODO: document this class
public class PA2a {


	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter five whole numbers: ");
        
        // Int for Variables
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        
        // Set Sums = 0
        int positiveSum = 0;
        int nonPositiveSum = 0;
        int totalSum = num1 + num2 + num3 + num4 + num5;

        int positiveCount = 0;
        int nonPositiveCount = 0;

        // Calculate sums 
        if (num1 > 0) {
            positiveSum += num1;
            positiveCount++;
        } else {
            nonPositiveSum += num1;
            nonPositiveCount++;
        }

        if (num2 > 0) {
            positiveSum += num2;
            positiveCount++;
        } else {
            nonPositiveSum += num2;
            nonPositiveCount++;
        }

        if (num3 > 0) {
            positiveSum += num3;
            positiveCount++;
        } else {
            nonPositiveSum += num3;
            nonPositiveCount++;
        }

        if (num4 > 0) {
            positiveSum += num4;
            positiveCount++;
        } else {
            nonPositiveSum += num4;
            nonPositiveCount++;
        }

        if (num5 > 0) {
            positiveSum += num5;
            positiveCount++;
        } else {
            nonPositiveSum += num5;
            nonPositiveCount++;
        }
        // AveragePositive Equation and averageNonPositive Equation
        double averagePositive = 0;
        if (positiveCount > 0) {
        	averagePositive = (double) positiveSum / positiveCount;
        }
        
        double averageNonPositive = 0;
        if (nonPositiveCount > 0) {
        	averageNonPositive = (double) nonPositiveSum / nonPositiveCount;
        }
        double averageAll = totalSum / 5.0;
        
        // Output results
       if (positiveCount == 1) {
    	   System.out.printf("The sum of %d positive number: %d%n", positiveCount, positiveSum);
       } else {
    	   System.out.printf("The sum of the %d positive numbers: %d%n", positiveCount, positiveSum);
       }
       if (nonPositiveCount == 1) {
    	   System.out.printf("The sum of %d non-positive number: %d%n", nonPositiveCount, nonPositiveSum);
       } else {
    	   System.out.printf("The sum of the %d non-positive numbers: %d%n", nonPositiveCount, nonPositiveSum);
       }
      
       System.out.printf("The sum of the 5 numbers: %d%n", totalSum);
       
        // Calculate and output averages
        if (positiveCount == 1) {
            System.out.printf("The average of the %d positive number: %.2f%n", positiveCount, averagePositive);
        } else {
            System.out.printf("The average of the %d positive numbers: %.2f%n", positiveCount, averagePositive);
        }

        if (nonPositiveCount == 1) {
            System.out.printf("The average of the %d non-positive numbers: %.2f%n", nonPositiveCount, averageNonPositive);
        } else {
            System.out.printf("The average of the %d non-positive numbers: %.2f%n", nonPositiveCount, averageNonPositive);
        }

        // Calculate and output the average of all numbers
        System.out.printf("The average of the 5 numbers: %.2f%n", averageAll);
        
        scanner.close();
    }
}
