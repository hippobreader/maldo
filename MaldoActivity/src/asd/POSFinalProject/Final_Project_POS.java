package POSFinalProject;

import java.util.*;

public class Final_Project_POS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        POS p = new POS();

        p.displayproducts();
        while (true) {
            System.out.println("\nSelect a product(1 - " + p.products.length + ") to add to cart");
            System.out.println("Enter (0) to Checkout");
            System.out.print("Enter your Choice: ");
            String userchoice = sc.nextLine();

            if (userchoice.equals("0")) {
                p.checkout();
                break;
            }

            int productnum = Integer.parseInt(userchoice);
            if (productnum >= 1) {
                p.addtocart(productnum);
                System.out.println("Added \"" + p.products[productnum - 1] + "\" to cart");
            }

        }

    }
}