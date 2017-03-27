import java.io.*;
import java.util.*;

public class SolutionDay20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        int[] numbers = new int[amount];
        int numberOfSwaps = 0;

        for(int i = 0;i<numbers.length;i++){
            numbers[i] = scan.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (numbers[j] > numbers[j + 1]) {
                    int tmpNumber = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = tmpNumber;
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }

        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + numbers[0]);
        System.out.println("Last Element: " + numbers[numbers.length -1]);
    }
}