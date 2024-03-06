import java.util.Scanner;

public class Maldo_Assignment_2D_Assignment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // create array
        String[][] criminals = new String[10][3]; // create 3 columns, 10 rows

        int i, j;
        int smallest; // smallest is the current smallest element
        int temp; // make an element swaps
        String line;

        // loop to request to fill array
        for (int row = 0; row < criminals.length; row++) {
            System.out.println("Enter a criminal name: ");
            while (in.hasNext()) {
                criminals[row][0] = in.nextLine();
                System.out.print("Enter a crime: ");
                criminals[row][1] = in.nextLine();
                System.out.print("Enter a year: ");
                criminals[row][2] = in.nextLine();

            }
        }

        System.out.println(criminals);
    }

}