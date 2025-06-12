import   datetime




def getcustomer_name():
	customer_name = input(" What is the customer's Name : ")





def getcashier_name():
	cashier_name = input("Enter cashier Name : ")



def getavailable_product():
	print("Available Product : Bread , VideoGame , Water " )

	available_product = input(" What do you want to buy ")


def getproduct_price(customer_choice):
	if customer_choice.equalsIgnoreCase("Bread"):
		return 500
	if customer_choice.equalsIgnoreCase("VideoGame"):
		return 2000
	if customer_choice.equalsIgnoreCase("Water"):
		return 200
	
	
def getproduct_quantity(available_product):
	 product_quantity = int(input(" How many pieces " ))
	 while(input.isDigit()):
	  print("Invalid quantity: Enter a number ")
	  return product_quantity			

def getdate_time():
	return datetime.datetime



def getstore_product_calculations(getcashier_name, getcustomer_name, available_product, getproduct_quantity , product_price ):
	 discount =  product_price * product_quantity * 7.5 / 100
	 vat = product_price *  product_quantity * 17.58 / 100
	 total = (product_price * product_quantity ) - discount + vat

print( " Receipt: ")
print( " =======================================================")	
print(     "  SEMICOLON STORES   ")
print(   "  MAIN BRANCH  ")  
print(  "Location: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS")
print( "  Date : " ,  getdate_time() )
print( " customer : ", getcustomer_name())
print( "cashier : ", getcashier_name())
print("===========================================================")
print("  ITEM          QTY          PRICE          TOTAL(NGN) ")
print("------------------------------------------------------------")
print("%s , %2.f%n , %2.f%n", getavailable_product, getproduct_quantity, getproduct_price  (getproduct_price *   getproduct_quantity))
print("---------------------------------------------------------------")
print(" Sub Total :%2.f\nDISCOUNT :  -%2.f \nVAT: +%2.f",(product_price *   product_quantity), product_price , product_quantity)

print("=============================================================")
print(" Bill Total: ", total)
print("==============================================================")
print("THIS IS NOT AN RECEIPT, KINDLY PAY ",   total)
print("===============================================================")



def main():
	getcustomer_name(customer_name)
	getcashier_name(cashier_name)
	getavailable_product(available_product)
	getproduct_quantity(product_quantity)
	
	getstore_product_calculations(available_product , product_price, product_quantity , cashier_name, customer_name )




 
	
			