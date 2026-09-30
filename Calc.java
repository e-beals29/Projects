
/**
 * Elizabeth Beals
 * Sep 30th, 2026
 */
public class Calc {
    private double num1;
    private double num2;
    
    // Default constructor
    public Calc() {
        this.num1 = 0.0;
        this.num2 = 0.0;

    }
    
    // Setter for num1
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    // Setter for num2
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    // Getter for num1
    public double getNum1() {
        return this.num1;
    }

    // Getter for num2
    public double getNum2() {
        return this.num2;
    }
    
    // Method to add
    public double add() {
        return this.num1 + this.num2;
    }
    
    // Method to subtract
    public double subtract() {
        return this.num1 - this.num2;
    }
    
    // Method to multiply
    public double multiply() {
        return this.num1 * this.num2;
    }
    
    // Method to divide
    public double divide() {
        if (this.num2 == 0) {
            System.out.println("Error: Division by zero.");
            return 0.0;
        }
        return this.num1 / this.num2;
    }
    
    //Custom toString method
    @Override
    public String toString() {
        return "Displaying private data fields using toString():\n" + 
                "Num1: " + this.num1 + "\n" +
                "Num2: " + this.num2;
    }
}