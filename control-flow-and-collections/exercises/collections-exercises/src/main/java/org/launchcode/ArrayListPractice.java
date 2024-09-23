package org.launchcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        // Printing out the summary
        System.out.println("Summary of even numbers: " + ArrayListPractice.sumEven(arr));

        // Creating an ArrayList of words
        ArrayList<String> words = new ArrayList<>();
        words.add("mother");
        words.add("father");
        words.add("daughter");
        words.add("son");
        words.add("grandmother");
        words.add("grandfather");
        System.out.println(words);

        // Getting user input for the word's length
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word length to search for: ");
        int searchLength = input.nextInt();

        // Print words with the specified length
        System.out.println("Words with " + searchLength + " letters:");
        printWordsWithLength(words, searchLength);

        // Close the scanner
        input.close();
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void printWordsWithLength(ArrayList<String> words, int length) {
        for (String word : words) {
            if (word.length() == length) {
                System.out.println(word);
            }else{
                System.out.println("There are no words with given length.");
            }
            return;
        }
    }



}
