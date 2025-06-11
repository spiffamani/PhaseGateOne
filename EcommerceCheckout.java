import java.time.LocalDateTime;
import java.util.Scanner;

public class EcommerceCheckout {   

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
        System.out.println("\nAvailable Products: Cornflakes, Bread, Video Game");  
        System.out.print("What do you want to buy? ");  
        return input.nextLine();  
    }  

    public static double getProductPrice(String product) {  
        if (product.equalsIgnoreCase("Cornflakes")) return 200;  
        if (product.equalsIgnoreCase("Bread")) return 500;  
        if (product.equalsIgnoreCase("Video Game")) return 1500;  
        return 0;  
    }  

    public static double getProductQuantity() {  
        Scanner input = new Scanner(System.in);  
        System.out.print("How many do you want? ");  
        while (!input.hasNextDouble()) {  
            System.out.println("Invalid quantity. Enter a number.");  
            input.next();  
        }  
        return input.nextDouble();  
    }  

    public static LocalDateTime getPurchaseTime() {  
        return LocalDateTime.now();  
    }  

    public static void generateReceipt(String customerName, String cashierName, String productName, double quantity, double price) {  
        double discount = price * quantity * (7.5 / 100);  
        double vat = price * quantity * (17.58 / 100);  
        double total = (price * quantity) - discount + vat;  

        System.out.println("\n=====================================");  
        System.out.println("          SEMICOLON STORES           ");  
        System.out.println("         MAIN BRANCH                 ");  
        System.out.println(" Location: 312, HERBERT MACAULAY WAY,");  
        System.out.println("           SABO YABA, LAGOS.         ");  
        System.out.printf(" Date: %s%n", getPurchaseTime());  
        System.out.printf(" Cashier: %s%n", cashierName);  
        System.out.printf(" Customer: %s%n", customerName);  
        System.out.println(" =====================================");  
        System.out.printf("\n ITEM     QTY    PRICE    TOTAL(NGN)");  
        System.out.println("\n ------------------------------------");  
        System.out.printf("\n %s   %.2f   %.2f   %.2f", productName, quantity, price, (price * quantity));  
        System.out.println("\n--------------------------------------");  
        System.out.printf("\n Sub Total: %.2f\nDiscount: -%.2f\nVAT: +%.2f", (price * quantity), discount, vat);  
        System.out.println("\n ======================================");  
        System.out.printf("\n Bill Total: %.2f%n", total);  
        System.out.println("======================================");  
        System.out.println("   THIS IS NOT A RECEIPT, KINDLY PAY  ");  
        System.out.println("======================================");  
    }  

    public static void main(String[] args) {  
        String customerName = getCustomerName();  
        String cashierName = getCashierName();  
        String productName = getProductName();  
        double quantity = getProductQuantity();  
        double price = getProductPrice(productName);  

        if (price == 0) {  
            System.out.println("\nInvalid product selection. Please restart.");  
            return;  
        }  

        generateReceipt(customerName, cashierName, productName, quantity, price);  
    }  
}