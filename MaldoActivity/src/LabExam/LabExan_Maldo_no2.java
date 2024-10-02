package LabExam;
import java.util.*;
public class LabExan_Maldo_no2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SORT sort = new SORT();
        
        System.out.print("Enter input:  ");
        String[] tokens = sc.nextLine().split(" ");
        int n = tokens.length;
        int[] arr = new int[n];

        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

       
        
        sort.BubbleSort(arr);
        System.out.println("Sorted array: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        sort.findAndPrintLongestConsecutiveSequence(arr);

    }
}

