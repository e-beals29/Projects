
/**
 * Elizabeth Beals
 * Nov 13, 2026
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class M8A1 { 
    public static void main(String[] args) {
        String inputFile = "pay.csv";
        String outputFile = "output.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            // 1. Read the header row from pay.csv and skip it
            br.readLine();

            // 2. Write the new header row to output.csv
            bw.write("EmpID,PayRate,HoursWorked,WeeklyPay");
            bw.newLine();

            String line;

            // 3. Loop through the rest of the employee rows
            while ((line = br.readLine()) != null) {
                // Skip any accidental blank lines at the bottom of the file
                if (line.trim().isEmpty()) {
                    continue;
                }

                // Split the row by commas into an array
                String[] columns = line.split(",");

                // Grab the pieces: [0] is EmpID, [1] is PayRate, [2] is HoursWorked
                String empId = columns[0].trim();
                double rate = Double.parseDouble(columns[1].trim());
                double hours = Double.parseDouble(columns[2].trim());

                // 4. Calculate weekly pay with overtime (1.5x for hours over 40)
                double weeklyPay;
                if (hours > 40) {
                    double regularPay = 40 * rate;
                    double overtimePay = (hours - 40) * (rate * 1.5);
                    weeklyPay = regularPay + overtimePay;
                } else {
                    weeklyPay = hours * rate;
                }

                // 5. Format weekly pay with a $ and 2 decimal places (turns into a String)
                String formattedPay = String.format("$%.2f", weeklyPay);

                // 6. Build the output line and write it to output.csv
                String outputLine = empId + "," + columns[1].trim() + "," + columns[2].trim() + "," + formattedPay;
                bw.write(outputLine);
                bw.newLine();
            }

            System.out.println("Success! output.csv has been created.");

        } catch (IOException e) {
            System.out.println("Error reading or writing files: " + e.getMessage());
        }
    }
}