package Median;
import java.util.*;

public class Median {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        QuickSort sort = new QuickSort();
        
        System.out.println("Enter the size of array: ");
        int num = sc.nextInt();
        int [] arr = new int[num];
        
        System.out.println("Enter the Elements: ");
        for(int i = 0; i < num; i++){
            int element = sc.nextInt();
            arr[i] = element;
        }
        sort.printArray(arr);
        sort.quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        sort.printArray(arr);
        
        System.out.println("The Median of Your Element is "+sort.medfind(arr));
    }
}
