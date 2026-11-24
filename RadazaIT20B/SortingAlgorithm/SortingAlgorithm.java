/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sorting.algorithm;

import java.util.Scanner;
import java.util.Arrays;

public class SORTINGALGORITHM {
    
    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== SORTING ALGORITHMS =====");

        System.out.print("Enter how many numbers: ");
        int size = input.nextInt();

        if (size <= 0) {
            System.out.println("Please enter a positive number.");
            input.close();
            return;
        }

        int[] originalArray = new int[size];

        // User Input
        System.out.println("\nEnter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            originalArray[i] = input.nextInt();
        }

        // Separate Copies
        int[] bubbleArray = originalArray.clone();
        int[] selectionArray = originalArray.clone();
        int[] insertionArray = originalArray.clone();

        System.out.println("\nOriginal Array: "
                + Arrays.toString(originalArray));

        // Bubble Sort
        bubbleSort(bubbleArray);
        System.out.println("Bubble Sort: "
                + Arrays.toString(bubbleArray));

        // Selection Sort
        selectionSort(selectionArray);
        System.out.println("Selection Sort: "
                + Arrays.toString(selectionArray));

        // Insertion Sort
        insertionSort(insertionArray);
        System.out.println("Insertion Sort: "
                + Arrays.toString(insertionArray));

        input.close();
    }
}


