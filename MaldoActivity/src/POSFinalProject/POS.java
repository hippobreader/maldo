package POSFinalProject;

import java.util.*;

public class POS {

    public ArrayList<String> cart;
    public ArrayList<Double> prices;

    public String[] products;
    public double[] productprices;

    POS() {
        cart = new ArrayList<>();
        prices = new ArrayList<>();
        products = new String[] { "Minerale Bottled Water 1L",
                "Nissin Cup Noodles",
                "Coke 1.5L",
                "Gardenia Loafbread",
                "Donut",
                "Ice Cream",
                "Redbull",
                "Toblerone",
                "Burger",
                "Milk",
                "Onigiri" };
        productprices = new double[] { 20.00,
                41.00,
                85.00,
                68.75,
                35.00,
                20.00,
                45.00,
                75.00,
                35.00,
                80.00,
                35.00 };
    }

    public void displayproducts() {
        System.out.println("\n        " + "PRODUCTS" + "        \n");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " - Php (" + productprices[i] + ")");
        }
    }

    public void addtocart(int productnum) {
        String selectedproduct = products[productnum - 1];
        double selectedprice = productprices[productnum - 1];

        cart.add(selectedproduct);
        prices.add(selectedprice);
    }

    public void checkout() {
        Scanner sc = new Scanner(System.in);
        double total = calculatedtotal();
        while (true) {
            System.out.println("\n       [CART]");
            for (int i = 0; i < cart.size(); i++) {
                System.out.println(cart.get(i) + " - Php (" + prices.get(i) + ")");
            }
            System.out.println("\n\n       Total:          - Php (" + total + ")");

            System.out.print("Enter Amount to Pay: Php - ");
            double amountpaid = sc.nextInt();

            if (amountpaid >= total) {
                double change = amountpaid - total;
                System.out.println("\nChange: - Php (" + change + ")");
                System.out.println("\n   PURCHASE COMPLETE   ");
                System.out.println("\n\n      THANK YOU!!  ");
                System.out.println("\n      COME AGAIN \n");
                break;
            } else {
                System.out.println("\n\n   Insufficient Amount Paid!!");
                System.out.println("\n           TRY AGAIN!");
            }

        }
    }

    public double calculatedtotal() {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

}