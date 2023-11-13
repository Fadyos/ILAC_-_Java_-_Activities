package gui_swing_events;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Excel {

    // Declare the private class variable (field)
    // This variable will be an empty "ArrayList" object of "Double" data type
    // To save/retrieve the user's input numbers from the textfield in the GUI
    private ArrayList<Double> numbers = new ArrayList<>();

    /*
     * Declare the first constructor method: Accepts one parameter of
     * ArrayList<Double> Notice that this constructor will not be called in this
     * assignment, but it's good to have it in case we need to immediately pass
     * ArrayList
     */
    public Excel(ArrayList<Double> numbers) {
        // Assign the passing parameter to the class variable
        // The class variable is your "ArrayList" object, for example: "numbers"
        this.numbers = numbers;
    } // end Constructor1

    /*
     * Declare the second constructor method (Overloading): - passing an
     * argument/parameter of String data type NOTE: This passing string will
     * represent the user's input (string of numbers)
     */
    public Excel(String str) {
        // Creating an array of String data type out of the string of numbers
        // using .split() method:
        // You can name it for example: "strNumArray"

        // `\\s` represents any whitespace character (including spaces, tabs, and
        // others),
        // and the * quantifier means zero or more occurrences.
        //
        // For example, if you have a string like " 10.5 , 20.3 , 30.7 ", using
        // split("\\s*,\\s*")
        // would result in an array of three substrings: ["10.5", "20.3", "30.7"], with
        // leading and
        // trailing spaces removed from each substring.
        String[] strNumArray = str.split("\\s*,\\s*");

        // Creating a list view (List Interface) from the previous array
        // using .asList() method of the "Arrays" class
        // You can name it "strNumList"
        List<String> strNumList = Arrays.asList(strNumArray);

        // Creating an ArrayList object ("ArrayList" Class) from the previous List:
        // You can name it "strNumArrayList"
        ArrayList<String> strNumArrayList = new ArrayList<>(strNumList);

        // Finally, using forEach to loop through the previous "ArrayList" object
        // 1. Converting each item of String Data type to "Double"
        // 2. Adding the value to the "ArrayList" object "numbers"
        // NOTE: Using double so it can handle both whole numbers and fractions
        strNumArrayList.forEach(s -> numbers.add(Double.parseDouble(s)));

        // for testing (optional) 😊
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        } // end for loop
    } // end Constructor2

    /*
     * Start declaring the 4 individual methods: - findTotal() method - findAvg()
     * method - findMax() method - findMin() method NOTES: - All the method should
     * be publicly accessed - All the method should return a double data type (for
     * sure) :-) - No need to pass any argument as you can call the ArrayList
     * variable
     */

    // Define the first method "findTotal" to return the total
    public double findTotal() {
        double total = 0.0;
        for (Double number : numbers) {
            total += number;
        }
        return total;
    }

    // Define the second method "findAvg" to return the average
    public double findAvg() {
        return findTotal() / numbers.size();
    }

    // Define the third method "findMax" to return the maximum number
    public double findMax() {
        double max = Double.MIN_VALUE;
        for (Double number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    // Define the fourth method "findMin" to return the minimum number
    public double findMin() {
        double min = Double.MAX_VALUE;
        for (Double number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
} // end class file
