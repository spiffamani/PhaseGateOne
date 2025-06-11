import java.time.LocalDateTime;
import java.util.Scanner;

public class EcommerceCheckouts { 

     static String[] availableProduct = {"Cornflakes", "Bread", "Video Game"};
     static double[] availableProductPricePerUnit = {200, 500, 1500};
     static double discountRate = 7.5 / 100;
     static double vatRate = 17.58 / 100;

    public static String getCustomerName() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nWhat is the customer's name? ");
        return input.nextLine();
    }

    public static String getCashierName() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nWhat is the cashier's name? ");
        return input.nextLine();
    }

    public static String getProductName() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nAvailable Products:");
	//for(int product = 0; product < availableProduct.length; product++);
        for (String product : availableProduct) {
            System.out.println(product);
        }

        System.out.print("\nEnter product name: ");
        return input.nextLine();
    }

    public static double getProductQuantity() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter quantity: ");
        return input.nextDouble();
    }

    public static double getProductPrice(String productName) {
        for (int i = 0; i < availableProduct.length; i++) {
            if (availableProduct[i].equalsIgnoreCase(productName)) {
                return availableProductPricePerUnit[i];
            }
        }
        return 0; // Product not found
    }

    public static void generateReceipt(String customerName, String cashierName, String productName, double quantity, double pricePerUnit) {
        LocalDateTime purchaseTime = LocalDateTime.now();
        double totalPrice = quantity * pricePerUnit;
        double discount = totalPrice * discountRate;
        double vat = totalPrice * vatRate;
        double finalPrice = totalPrice - discount + vat;

        System.out.println("\n=====================================");
        System.out.println("          SEMICOLON STORES           ");
        System.out.println("         MAIN BRANCH                 ");
        System.out.println(" Location: 312, HERBERT MACAULAY WAY,");
        System.out.println("           SABO YABA, LAGOS.         ");
        System.out.printf(" Date: %s%n", purchaseTime);
        System.out.printf(" Cashier: %s%n", cashierName);
        System.out.printf(" Customer Name: %s%n", customerName);
        System.out.println(" =====================================");

        System.out.printf("\n ITEM     QTY    PRICE    TOTAL(NGN)");
        System.out.println("\n ------------------------------------");
        System.out.printf("\n %s   %.2f   %.2f   %.2f", productName, quantity, pricePerUnit, totalPrice);
        System.out.println("\n--------------------------------------");
        System.out.printf("\n Sub Total: %.2f\nDiscount: -%.2f\nVAT: +%.2f", totalPrice, discount, vat);
        System.out.println("\n ======================================");
        System.out.printf("\n Bill Total: %.2f%n", finalPrice);
        System.out.println("======================================");
        System.out.println("   THIS IS NOT A RECEIPT, KINDLY PAY  ");
        System.out.println("======================================");
    }

    public static void main(String[] args) {
        String customerName = getCustomerName();
        String cashierName = getCashierName();
        String productName = getProductName();
        double quantity = getProductQuantity();
        double pricePerUnit = getProductPrice(productName);

        if (pricePerUnit == 0) {
            System.out.println("\nInvalid product selection. Please restart.");
            return;
        }

        generateReceipt(customerName, cashierName, productName, quantity, pricePerUnit);
    }
}














