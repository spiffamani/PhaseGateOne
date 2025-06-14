function getcustomerName(){
let customerName = String("Enter customer's Name ")
return customerName;
}



function getcashierName(){
let cashierName = String("Enter customer's Name ")
return cashierName;
}



function getproductName(){
console.log("\n Available product : , Videogame ,  Water ,  Meat , Bread ")
let productName = String(" What do you want " )
return productName;
}


function  getproductPrice(){
if(product.equalsIgnoreCase(" Videogame ")) return 1000;
if(product.equalsIgnoreCase(" Water ")) return 100;
if(product.equalsIgnoreCase(" Meat ")) return 2000;
if(product.equalsIgnoreCase(" Bread ")) return 500;
return 0;
}


function getproductQuantity(){
let productQuality = (" How many do you want ")
while(!input.hasNextDouble()){
console.log(" invalid input : Try again ")
input.next()
return productQuality;
}
}


function getdateTime(){
return dateTime.now();


function getstoreReceipt( productName ,  customerName ,   cashierName , productQuantity ,  productPrice ){

let discount = productPrice * productQuantity * (7.5 / 100);
let vat = productPrice * productQuantity * (17.58 / 100);
let total = productPrice * productQuantity - discount + vat

console.log("\n====================================================");
console.log("\n  SEMICOLON STORE   ");
console.log("\n  MAIN BRANCH  " );
console.log("\n location: 312 HERBERT MACAULAY WAY SABO YABA LAGOS ");
console.log("\n Date : %s%n" , getdateTime());
console.log("\n Customer Name: %s%n ", customerName ); 
console.log("\n Cashier Name: %s%n ", cashierName );
console.log("\n=======================================================");
console.log("\n ITEM       QTY       PRICE       TOTAL(NGN)");
console.log("\n--------------------------------------------------------");
console.log("\n sub total : %2.f\nDISCOUNT: -%2.f \nVAT: +%2.f ",    (productPrice * productQuantity),  discount ,  vat );
console.log("\n BILL TOTAL: %2.f%n" ,  total);
console.log("\n===========================================================");
console.log("\n THIS IS NOT AN RECEIPT, KINDLY PAY "  ,   total );
console.log("\n=============================================================");
}


 main()
let productName = getproductName
let customerName = getcustomerName
let cashierName  = getcashierName
let  productQuantity = getproductQuantity
let  productPrice =  getproductPrice


if (productPrice == 0){
console.log("\n Invalid  product  selection : please restart");
return;

}
getstoreReceipt( productName ,  customerName ,   cashierName ,  productQuantity , productPrice )

}






































