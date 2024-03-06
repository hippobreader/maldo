import java.util.Scanner;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> cart = new ArrayList<>();// para dira istore tanan product na gi palit
        ArrayList<Double> prices = new ArrayList<>();// dira istore ang prices sa product

        String[] products = { "Longgadog", "Bolbits", "Anal Beads", };
        double[] productPrices = { 100.25, 5.75, 250.50 };

        // Display tanan product ug price
        System.out.println("\n--- Products ---");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " - Php " + productPrices[i]);
        }

        double total = 0;
        while (true) {
            System.out
                    .println("\nSelect a product (1 - " + products.length + ") to add to cart or enter 0 to checkout:");
            System.out.print("Your choice: ");
            String userInput = scanner.nextLine();

            if (userInput.equals("0")) {
                break; // Exit the loop after checkout, mo proceed na sa next while loop
            }

            // Check sa code kung integer ang gi input mugawas ang invalid if dili
            if (!userInput.matches("\\d+")) {
                System.out.println("Invalid input. Please enter a valid product number or '0' to checkout.");
                continue; // restart ang loop
            }

            int productNumber = Integer.parseInt(userInput); // convert ang string to int
            if (productNumber >= 1 && productNumber <= products.length)// check if number na gi input sa user kay
                                                                       // greater or equal than 1 ug less than or equal
                                                                       // sa tanan product
            {
                String selectedProduct = products[productNumber - 1];// minus 1 kay mag sugod na sa 0
                double selectedPrice = productPrices[productNumber - 1];// minus 1 kay mag sugod na sa 0
                cart.add(selectedProduct); // gistore sa cart ang selected product
                prices.add(selectedPrice); // gistore sa prices ang selected price
                total += selectedPrice; // ibutang sa total ang price sa product
                System.out.println("Added \"" + selectedProduct + "\" to cart. Total: Php " + total);
            } else {
                System.out.println("Invalid product number. Please try again.");
            }
        }

        // Checkout process
        while (true) {
            System.out.println("\n--- Cart ---");
            for (int i = 0; i < cart.size(); i++) { // loop para mag display tanan gi add sa cart. ang cart arraylist na
                System.out.println(cart.get(i) + " - Php " + prices.get(i));
            }
            System.out.println("Total: Php " + total);

            System.out.print("Enter amount paid: Php ");
            double amountPaid = scanner.nextDouble();

            if (amountPaid >= total) {
                double change = amountPaid - total;
                System.out.println("Change: Php " + change);
                System.out.println("Thank you for your purchase!");
                break; // Exit the checkout loop
            } else {
                System.out.println("Insufficient amount paid. Please try again.");
            }
        }
    }
}