import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArrayByParity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int nextEven = 0;
        int nextOdd = arr.length - 1;

        while (nextEven < nextOdd) {
            if (arr[nextEven] % 2 == 0) {
                nextEven++;
            } else if (arr[nextOdd] % 2 != 0) {
                nextOdd--;
            } else {
                int temp = arr[nextEven];
                arr[nextEven] = arr[nextOdd];
                arr[nextOdd] = temp;
                nextEven++;
                nextOdd--;
            }
        }

        int[] evenNumbers = new int[nextEven];
        int[] oddNumbers = new int[arr.length - nextEven];

        int evenIndex = 0;
        int oddIndex = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenNumbers[evenIndex++] = num;
            } else {
                oddNumbers[oddIndex++] = num;
            }
        }

        Arrays.sort(evenNumbers);
        Arrays.sort(oddNumbers);

        int index = 0;
        for (int num : evenNumbers) {
            arr[index++] = num;
        }
        for (int num : oddNumbers) {
            arr[index++] = num;
        }

        System.out.print("Rearranged array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}