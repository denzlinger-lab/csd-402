/**

 * * Abram Denzlinger
 * February 21, 2026
 * Assignment 8.1 - Inheritance and Polymorphism

 * * This class includes a static method to find the maximum value in an ArrayList
 * and a main method to handle user input and display results.

 * * Testing & Extra
 * I've included a 'TEST_MODE' toggle to bypass manual input and run the test
 * cases.
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class AbramArrayList<E> {
    // Testing Toggle: Set to true to run "additional code for testing"
    private static final boolean TEST_MODE = false;

    // Core fields for storing data and tracking the list size
    private Object[] elementData;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * Constructor to initialize the list with a starting capacity
     */
    public AbramArrayList() {
        this.elementData = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    /**
     * Instruction: "The method signature is to be public static Integer max (ArrayList list)"
     * Instruction: "The method is then to return the largest value in the ArrayList."
     * Instruction: "If the ArrayList is sent in empty, the method will then return 0."
     */
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }

        Integer max = list.get(0);

        for (Integer num : list) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        if (TEST_MODE) {
            runTests();
        } else {
            executeUserInput();
        }
    }

    /**
     * Instruction: "The method will return the largest value that is displayed to the user."
     */
    private static void executeUserInput() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> userInputList = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to finish):");

        int input;
        do {
            input = scanner.nextInt();
            userInputList.add(input);
        } while (input != 0);

        // Capture returned value and display to user
        Integer result = max(userInputList);
        System.out.println("The largest value is: " + result);

        scanner.close();
    }

    /**
     * Instruction: "Write additional code for testing your method."
     */
    private static void runTests() {
        System.out.println("--- Running Additional Test Code ---");

        // Test 1: Mixed positive integers
        ArrayList<Integer> test1 = new ArrayList<>(Arrays.asList(1, 5, 3, 0));
        System.out.println("Test 1 (Positive): Expected 5, Got: " + max(test1));

        // Test 2: Negative numbers and 0
        ArrayList<Integer> test2 = new ArrayList<>(Arrays.asList(-10, -2, -5, 0));
        System.out.println("Test 2 (Negative/Zero): Expected 0, Got: " + max(test2));

        // Test 3: Empty List
        ArrayList<Integer> test3 = new ArrayList<>();
        System.out.println("Test 3 (Empty): Expected 0, Got: " + max(test3));

        // Test 4: Only 0
        ArrayList<Integer> test4 = new ArrayList<>(Arrays.asList(0));
        System.out.println("Test 4 (Only 0): Expected 0, Got: " + max(test4));
    }
}