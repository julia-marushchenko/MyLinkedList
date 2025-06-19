// Java program to demonstrate Java LinkedList

import java.util.LinkedList;

// Main method to run java program
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating LinkedList
        LinkedList<Float> list = new LinkedList<>();

        // Adding elements to list
        list.add(1.3F);
        list.add(2.4F);
        list.add(3.1F);
        list.add(4.9F);
        list.add(5.0F);

        // Printing elements of list to console
        System.out.println(list);

        // Adding first element to the list
        list.addFirst(8.7F);

        // Printing first elements of list to console
        System.out.println("First element is: " + list.peekFirst());

        // Adding last element to the list
        list.add(6.1F);

        // Printing elements of list to console
        System.out.println("Last element is: " + list.peekLast());

    }
}