/**
 This program demonstrates the Exam class,
 which extends the Assessment class.
 Elizabeth Beals 
 Updated Nov 9, 2026
 */

import javax.swing.JOptionPane;

public class Runner6 {

    public static void main(String[] args)
    {
        String input;          // To hold input
        int questions = 0;     // Number of questions
        int missed = 0;        // Number of questions missed
        boolean validInput;    // Flag for input validation

        // Get the number of questions on the exam
        validInput = false;
        while (!validInput) {
            try {
                input = JOptionPane.showInputDialog("How many questions are on the exam?");
                if (input == null) {
                    System.exit(0); // Exit cleanly if the user clicks Cancel
                }
                questions = Integer.parseInt(input);
                validInput = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a whole number.");
            }
        }

        // Get the number of questions the student missed
        validInput = false;
        while (!validInput) {
            try {
                input = JOptionPane.showInputDialog("How many questions did the student miss?");
                if (input == null) {
                    System.exit(0); // Exit cleanly if the user clicks Cancel
                }
                missed = Integer.parseInt(input);
                validInput = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a whole number.");
            }
        }

        // Create an Exam object and display results safely
        try {
            Exam exam = new Exam(questions, missed);

            // Display the test results
            String message = "Each question counts " + exam.getPointsEach();
            message += " points.\nThe exam score is " + exam.getScore();
            message += "\nThe exam grade is " + exam.getGrade();
            JOptionPane.showMessageDialog(null, message);
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Error: Cannot divide by zero. The exam must have at least 1 question.");
        }

        System.exit(0);
    }
}
