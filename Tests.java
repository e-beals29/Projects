
/**
 * Elizabeth Beals
 * MODIFIED Sep 21, 2026
 */

import java.util.Scanner;

public class Tests{ 
    private int scoreCount;
    private double average;

    // Constructor
    public Tests() {
        this.scoreCount = 0;
        this.average = 0.0;
    }

    // Public getter method
    public int getScoreCount() {
        return this.scoreCount;
    }

    public double getAverageValue() {
        return this.average;
    }

    // Custom method to collect scores and calculate the average
    public void getAverage() {
        Scanner input = new Scanner(inputSource());
        double sum = 0.0;
        int count = 0;
        System.out.print("Enter a test score (-1 to quit): ");
        double score = input.nextDouble();

        // Set up your loop condition
        while (score != -1) {
            sum += score;
            count++;
            
            System.out.print("Enter a test score (-1 to quit): ");
            score = input.nextDouble();
        }

        this.scoreCount = count;
        if (count == 0) {
            this.average = Double.NaN; // Results in NaN as expected in Test 1
        } else {
            this.average = sum / count;
        }
    }

    @Override
    public String toString() {
        return String.format("The average of the %d scores entered is %.2f.", this.scoreCount, this.average);
    }

    // Helper method
    private java.io.InputStream inputSource() {
        return System.in;
    }
}