/**
 The Exam class extends the Assessment class to determine
 a numeric score and letter grade based on questions missed.
 Elizabeth Beals
 Oct 30, 2026
**/

public class Exam extends Assessment {
    private int numQuestions; 
    private double pointsEach; 
    private int numMissed;     

    // Constructor accepts the number of questions on the exam 
    // and the number of questions missed
    public Exam(int questions, int missed) {
        this.numQuestions = questions;
        this.numMissed = missed;

        // Calculate points for each question
        this.pointsEach = 100.0 / questions;

        // Calculate the numeric score (total minus missed points)
        double numericScore = 100.0 - (missed * this.pointsEach);

        // Pass the calculated score up to the Assessment superclass
        // Cast to int since Assessment's setScore expects an integer
        setScore((int) Math.round(numericScore));
    }

    
    // getPointsEach method returns the points for each question.
    public double getPointsEach() {
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