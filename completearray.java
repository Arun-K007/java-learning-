import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {

        // Array Declaration and Initialization
        int[] arr = {10, 20, 30, 40, 50};

        // Print Array
        System.out.println("Array: " + Arrays.toString(arr));

        // Length
        System.out.println("Length: " + arr.length);

        // Access Element
        System.out.println("First Element: " + arr[0]);

        // Update Element
        arr[2] = 35;
        System.out.println("After Update: " + Arrays.toString(arr));

        // Traverse using for loop
        System.out.print("For Loop: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Traverse using for-each loop
        System.out.print("For-Each Loop: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();

        // Sum of Elements
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum: " + sum);

        // Maximum and Minimum
        int max = arr[0], min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // Sort
        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));

        // Binary Search
        int index = Arrays.binarySearch(arr, 40);
        System.out.println("Index of 40: " + index);

        // Copy Array
        int[] copy = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied Array: " + Arrays.toString(copy));

        // Fill Array
        int[] fillArray = new int[5];
        Arrays.fill(fillArray, 100);
        System.out.println("Filled Array: " + Arrays.toString(fillArray));

        // Compare Arrays
        System.out.println("Arrays Equal: " + Arrays.equals(arr, copy));

        // Reverse Array
        System.out.print("Reverse: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Multi-dimensional Array
        int[][] matrix = {
            {1, 2},
            {3, 4}
        };

        System.out.println("2D Array:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}