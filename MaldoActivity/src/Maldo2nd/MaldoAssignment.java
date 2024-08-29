import java.util.Scanner;

public class MaldoAssignment {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the temperature: ");
        int temp = sc.nextInt();

        
        if (temp > 95 || temp < 20) {
            System.out.println("Visit our shops!");
        }
        else if (temp >= 80) {
            System.out.println("Swimming");
        } 
        else if (temp > 60) {
            System.out.println("Tennis");
        } 
        else if (temp >= 40) {
            System.out.println("Golf");
        } 
        else 
            System.out.println("Skiing");
        
    }
}