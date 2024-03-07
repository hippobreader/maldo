package POSFinalProject;

import java.util.*;

public class Final_Project_POS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        POS p = new POS();

        p.displayproducts();// tawagon niya ang method na displayproducts
                            // para ma display ang tanan product
        while (true) {
            System.out.println("\nSelect a product(1 - " + p.products.length + ") to add to cart");
            System.out.println("Enter (0) to Checkout");
            System.out.print("Enter your Choice: ");
            String userchoice = sc.nextLine();

            if (userchoice.equals("0")) {
                p.checkout();
                break;// para pa exit sa loop once na mo checkout naka
            }
            // parseInt i convert niya ang string to int
            int productnum = Integer.parseInt(userchoice);
            if (productnum >= 1) {
                p.addtocart(productnum);// ireturn niya ang ang number na gipili sa user didto sa addtocart na method
                System.out.println("Added \"" + p.products[productnum - 1] + "\" to cart");
            }

        }
        //hehe
        
    }
}