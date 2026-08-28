
/**
 * This code will take test scores and provide their average.
 * Elizabeth Beals
 * Aug 28, 2026
 */

public class Tests{ 
    public static void main(String[] args)
    {
        double score1 = 95.9;
        double score2 = 77.5;
        double score3 = 80.2;
        
        double average = (score1 + score2 + score3) / 3.0;
        
        System.out.println("Test score 1: " + score1);
        System.out.println("Test score 2: " + score2);
        System.out.println("Test score 3: " + score3);
        
        System.out.printf("The average of 3 test scores is: %.2f%n", average);
    }
}