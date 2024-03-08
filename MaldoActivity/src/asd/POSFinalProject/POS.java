package POSFinalProject;

import java.util.*;

public class POS {

    public ArrayList<String> cart;// dri ma store ang gi palit na products
    public ArrayList<Double> prices;// dri ma store ang prices sa gi palit na products

    public String[] products;// dri naka store ang mga baligya na products
    public double[] productprices;// dri naka store product prices

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
            35.00};
    }

    // method para ma display ang tanan products og prices
    public void displayproducts() {
        System.out.println("\n        " + "PRODUCTS" + "        \n");
        for (int i = 0; i < products.length; i++) // loop para ma display tanan product og prices
        {
            System.out.println((i + 1) + ". " + products[i] + " - Php (" + productprices[i] + ")");
        } // ing ani ang example ( 1 . Minerale Bottled Water 1L - Php (20.0)_
    }

    // method para ma add to cart
    public void addtocart(int productnum) {
        String selectedproduct = products[productnum - 1];// minus 1 para ma equal sa index number which is 0
        double selectedprice = productprices[productnum - 1];// same lang sa taas

        cart.add(selectedproduct);// gi store sa cart ang selected product na number na gi input sa user
        prices.add(selectedprice);// gi store ang prices sa selected product na number na gi pili sa user na
                                  // product
    }
    
    // method para ma checkout ang purchase
    public void checkout() {
        Scanner sc = new Scanner(System.in);
        double total = calculatedtotal();// calculatedtotal method na para ma total tanan prices
        while (true) {// while(true) para mag loop permi
            System.out.println("\n       [CART]");
            for (int i = 0; i < cart.size(); i++) {// loop para ma display tanan gi palit
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
                break;// exit sa loop na checkout
            } else {
                System.out.println("\n\n   Insufficient Amount Paid!!");
                System.out.println("\n           TRY AGAIN!");
            }

        }
    }

    // method para sa total prices
    public double calculatedtotal() {
        double total = 0;
        for (double price : prices) {// for each para ma kuha nya tanan prices na naka store sa (prices) na arraylist
            total += price;// nya total sum sa prices
        }
        return total;// ireturn nya ang total prices sa (double total) na naa sa tasas
    }

    
}