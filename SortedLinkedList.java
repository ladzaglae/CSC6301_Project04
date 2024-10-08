import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * A Class that implement a program that reads a list of Integer numbers from the scanned input
 * and saves them into a Linked List sorted from the smallest to the largest
 * 
 * <p>
 * Code reuse is done twice in the getInputFromUser method.
 * Firstly, LinkedList class of the Java collection framework is used to store the integers.
 * Secondly, sort method of the Collection class of the Java collection framework is used to sort the integers.
 * </p>
 * 
 * @author Evans Edem Ladzagla
 * @version 1.0.0
 */
public class SortedLinkedList {

    /**
     * Get integer numbers from users
     * 
     * <p>
     * Continually prompt user to enter intergers and store them using the 
     * LinkedList class from the java collection framework until done is entered.
     * Sort the numbers and return it.
     * </p>
     * 
     * @return numbers - LinkedList
     */
    public static LinkedList<Integer> getInputFromUser() {        
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for reading input        
        LinkedList<Integer> numbers = new LinkedList<>(); // Initialize a LinkedList to store Integer values
        System.out.println("Enter integers (type 'done' to finish):");

        // Read integers from user input
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                // If the input is an integer, add it to the list
                numbers.add(scanner.nextInt());
            } else if (scanner.next().equalsIgnoreCase("done")) {
                // Exit condition to stop input
                break;
            } else {
                System.out.println("Invalid input, please enter an integer or 'done'.");
            }
        }
        
        scanner.close(); // Close the scanner        
        Collections.sort(numbers); // Sort the LinkedList
        return numbers;
    }

    /**
     * Prints the list of integers to the console.
     *
     * @param numbers The list of integers to be printed.
     */
    public static void printList(LinkedList<Integer> numbers) {
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * An entry point to start the program.
     * 
     * <p>
     * Call getInputFromUser method to get sorted integers from user.
     * Print the numbers to the console.
     * </p>
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        LinkedList<Integer> numbers = getInputFromUser();

        // Output the sorted list
        System.out.print("Sorted list of integers: ");
        printList(numbers);
        
    }
}
