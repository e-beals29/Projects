/**
 The Exam class extends the Assessment class to determine
 a numeric score and letter grade based on questions missed.
 Elizabeth Beals
 Updated Nov 9, 2026
**/

public class Exam extends Assessment {
    private int numQuestions; 
    private int pointsEach; 
    private int numMissed;     

    // Constructor accepts the number of questions on the exam 
    // and the number of questions missed
    public Exam(int questions, int missed) {
        this.numQuestions = questions;
        this.numMissed = missed;

        // Calculate points for each question using integer division
        // Automatically throws ArithmeticException if questions is 0
        this.pointsEach = 100 / questions;

        // Calculate the numeric score (total minus missed points)
        int numericScore = 100 - (missed * this.pointsEach);

        // Pass the calculated score up to the Assessment superclass
        setScore(numericScore);
    }

    // getPointsEach method returns the points for each question as an int.
    public int getPointsEach() {
        return this.pointsEach;
    }

    // getNumQuestions method returns the number of questions.
    public int getNumQuestions() {
        return this.numQuestions;
    }

    // getNumMissed method returns the number of questions missed.
    public int getNumMissed() {
        return this.numMissed;
    }
}