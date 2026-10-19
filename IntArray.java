/**
 * Elizabeth Beals
 * Oct 19, 2026
 */

import java.util.Arrays;
import java.util.Random;

public class IntArray {
    // Private data fields
    private int length;
    private int myArr[];

    // Constructor
    public IntArray(int size) {
        this.length = size;
        this.myArr = new int[size];
    }

    // Returns the current size/length of the array
    public int size() {
        return this.length;
    }

    // Fills the array with random integers between 1 and 6
    public void fillRand() {
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            myArr[i] = rand.nextInt(6) + 1;
        }
    }

    // Sets a specific index to a new value
    public void set(int index, int value) {
        if (index >= 0 && index < length) {
            myArr[index] = value;
        }
    }

    // Gets the value stored at a specific index
    public int get(int index) {
        if (index >= 0 && index < length) {
            return myArr[index];
        }
        return -1; // Default return if index is out of bounds
    }

    // Empties the array by setting all elements to 0 and size to 0
    public void clear() {
        for (int i = 0; i < length; i++) {
            myArr[i] = 0;
        }
        this.length = 0;
    }

    // Checks if the array is empty
    public boolean isEmpty() {
        return this.length == 0;
    }

    // Sorts the array elements in ascending order
    public void sort() {
        if (length > 0) {
            Arrays.sort(myArr, 0, length);
        }
    }

    // Converts the array data into a readable format
    @Override
    public String toString() {
        if (this.length == 0) {
            return "[]";
        }
        
        // Only print up to the current active length
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < length; i++) {
            sb.append(myArr[i]);
            if (i < length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}