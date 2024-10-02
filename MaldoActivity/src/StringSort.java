import java.util.*;


public class StringSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Words: ");
        int numStrings = sc.nextInt();

        String[] strings = new String[numStrings];

        System.out.println("Enter the Words:");
        for (int i = 0; i < numStrings; i++) {
            strings[i] = sc.next();
        }

        Arrays.sort(strings, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

        
        System.out.println("Sorted array of strings by length:");
        for (String str : strings) {
            System.out.println(str);    
}
}   
}