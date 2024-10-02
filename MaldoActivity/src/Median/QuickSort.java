package Median;
public class QuickSort {
    
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
           
            int pi = partition(arr, low, high);

          
            quickSort(arr, low, pi - 1);  
            quickSort(arr, pi + 1, high); 
        }
    }

   
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; 
        int i = low - 1;  
        
        for (int j = low; j < high; j++) {
         
            if (arr[j] <= pivot) {
                i++;
           
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            printArray(arr);
        }

      
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        printArray(arr);
        return i + 1;  
    }

  
    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println(); 
        
    }
    public static double medfind(int [] quickSort){
         int n = quickSort.length;
         if(n % 2 == 0){
             int mid1 = quickSort[n / 2 - 1];
             int mid2 = quickSort[n / 2];
             return (mid1 + mid2)/ 2.0;
         }else{
             return quickSort[(n - 1) / 2];
         }
    }
}
