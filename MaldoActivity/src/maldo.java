import java.util.Scanner;

public class maldo {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String[][] student = {
            { "Gryxdane Maldo", "143764" },
            { "Charles Kent Labrador", "143847" },
            { "Ian Barrientos", "143846" },
            { "Joven Rafael", "143746" },
            { "Ismael Baguilar", "143357" },
            { "Kurt Limos", "143675" },
            { "Jericho Diezma", "174823" },
            { "Ivan Bryll Joseco", "124643" },
            { "Emmanuel Adrian Saludares", "143504" },
            { "Johnroy Chatto", "143747" }
      };

      System.out.println("Choose one: ");
      System.out.println("[1] Student Name ");
      System.out.println("[2] Student ID Number ");
      System.out.println("[3] Student ID and Name ");
      int choose = sc.nextInt();

      if (choose == 1) {

         System.out.println("Student Names: \n");

         for (int i = 0; i < student.length; i++) {

            System.out.println(student[i][0]);
            System.out.println("");
         }
      }
      if (choose == 2) {

         System.out.println("Student ID Number:\n");

         for (int i = 0; i < student.length; i++) {

            System.out.println(student[i][1]);
            System.out.println("");
         }
      }

      if (choose == 3) {

         System.out.println("Student ID Number and Names:\n");

         for (int row = 0; row < student.length; row++) {
            for (int col = 0; col < student[row].length; col++) {

               System.out.println(student[row][col]);
               System.out.println("");
            }
         }
      }

   }
}