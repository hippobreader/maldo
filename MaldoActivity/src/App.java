import java.util.Scanner;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
       System.out.println("Welcome to Lake LazeDays Resort!");
       System.out.println();
       System.out.println("Enter the temperature:");
       int temperature = scan.nextInt();
       
       if (temperature > 95 || temperature < 20 ){
           System.out.println("Visit our shop!");
       }
       else if (temperature >= 80){
            System.out.println("Swimming");
       } else if (temperature > 60) {
            System.out.println("Tennis");
        } else if (temperature >= 40) {
            System.out.println("Golf");
        } else { // This covers temp < 40
            System.out.println("Skiing");
        }
}
}   