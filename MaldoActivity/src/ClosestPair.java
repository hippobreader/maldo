import java.util.Arrays;
import java.util.Scanner;

public class ClosestPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int numElements = sc.nextInt();

        int[] arr = new int[numElements];

        System.out.println("Enter the elements:");
        for (int i = 0; i < numElements; i++) {
            arr[i] = sc.nextInt();
        }

        
        Arrays.sort(arr);

       
        int minDiff = Integer.MAX_VALUE;
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff < minDiff) {
                minDiff = diff;
                num1 = arr[i];
                num2 = arr[i + 1];
            }
        }

        // Print the result
        System.out.println("The closest pair is: " + num1 + " and " + num2);
    }
}