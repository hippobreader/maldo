import java.util.Scanner;

public class MultiDimArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number for Rows: ");
        int z = sc.nextInt();
        System.out.println("Enter Number for Columns: ");
        int x = sc.nextInt();

        int[][] array = new int[z][x];

        for (int i = 0; i < z; i++) {
            for (int j = 0; j < x; j++) {
                System.out.println("Enter Number Elements for Row " + (i + 1) + " Column " + (j + 1));
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < x; j++)
                System.out.println(array[i][j]);
        }
    }
}