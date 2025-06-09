import java.time.LocalDateTime;
import java.utill.Scanner;
public class EcommerceCheckout {
String[] availableProduct = {"cornflakes = 200 " , " bread = 500", "videoGame = 1500",};
double discount = 7.5 / 100;
double vat = 17.58 /100;

public static String  getcustomerName(String username){
Scanner input = new Scanner(System.in);
System.out.print("\n What is the customer's name ");
username = input.nextLine();
return username;
}

public static String  getcashierName(String cashierUsername){
//Scanner input = new Scanner(System.in);
System.out.print("\n What is the customer's name ");
cashierUsername = input.nextLine();
return cashierUsername;
}




public static String[]  productName(String[] availableProduct ,string[] userinput){
//Scanner input = new Scanner(System.in);
for(int index = 0; index < availableProduct.length; index++){
//if (available == userinput).equals;
availableProduct = index[availableProduct.length];
System.out.println(" What did the user buy ");
availableProduct = input.nextLine();
return availableProduct;
}
}


public static double productquantity( double Productcount){
//Scanner input = new Scanner(System.in);
System.out.println(" What did the user buy ");
Productcount = input.nextLine();
return Productcount;
}

public static double productPricePerUnit(  double PricePerUnit){
//Scanner input = new Scanner(System.in);
System.out.println(" What did the user buy ");
PricePerUnit = input.nextInt();
return PricePerUnit;
}


public static LocalDateTime customerPurchasingTime(
LocalDateTime userinputs , availableproduct userinput){
LocalDateTime userinput = LocalDateTime();
return userinput;
}


//public static double customerCashPaid(double cashpaid){








public static String item (String  addOrRemoveItem , String userinput , String cashierName){
//Scanner input = new Scanner(System.in);
System.out.println(" Add more items(yes / no) ");
addOrRemoveItem = input.nextLine();
//if (!userinput("yes")).equals;
//break;

System.out.print ("What is your name ");
cashierName = input.nextLine();



return  cashierName;
}




public static void main(String[] args){
 String customerNames = getcustomerName();
String cashierNames =  getcashierName();
LocalDateTime useinput = customerPurchasingTime();
System.out.print("\n SEMICOLON STORES");
System.out.printf("\n MAIN BRANCH");
System.out.printf("\n Location: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS. ");
System.out.printf("\ndate:", useinput );
System.out.printf("\nCashier :"  , cashierNames );
System.out.printf("\nCustomer Name :" , customerNames );
System.out.printf("\n ===================================== ");
System.out.printf("\nCustomer Name :" , customerNames );
System.out.printf("\n ------------------------------------ " );
System.out.printf("\nCustomer Name :" , customerNames );
System.out.printf("\n-------------------------------------- " );
System.out.printf("\nCustomer Name :" , customerNames );
System.out.printf("\n ======================================" );
System.out.printf("\nCustomer Name :" , customerNames );
System.out.printf("\n ======================================= ");
System.out.printf("\n THIS IS NOT AN RECEIPT KINDLY PAY " );
System.out.printf("\n ======================================= ");









}
}
 





















