import datetime

available_product = [ 'Bread' ,'videoGame' , 'Water' ]
available_product_price = [200 , 500, 100]
discount = 7.5 / 100
vat = 17.58 / 100
total = 0
sub_total = 0
bill_total = 0
total_vat = 0





def getcustomer_name():
	customer_name = input(" What is the customer's Name ")

def getavailable_product():
	for product in available_product:
		response = " yes"
	customer_product = input(" What did the user buy ")
	if (resons.equalsIgnoreCase(customer_product)):
			return customer_product

def getproduct_quantity(available_product):
	 product_quantity = int(input(" How many pieces " ))
				
for all_product_quantity in range(available_product_price):
		print( all_product_quantity)
			


def getcashier_name():
	cashier_name = input("Enter cashier Name")


def getstore_product_calculations(available_product_price , product_quantity ):
	 total =  available_product_price * product_quantity 
	 sub_total = total - (discount *   product_quantity) 
	 total_vat =  vat + (discount *  product_quantity)
	 bill_total = ( available_product_price * product_quantity ) +  			total_vat

print( " Receipt: ")
print( " =======================================================")	
print(     "  SEMICOLON STORES   ")
print(   "  MAIN BRANCH  ")  
print(  "Location: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS")
print( "  Date : " ,  datetime )
print( " Cashier : ",  getcashier_name)
print( "customer : ", getcustomer_name)
print("===========================================================")
print("  ITEM          QTY          PRICE          TOTAL(NGN) ")
print("------------------------------------------------------------")
print("%s %s%n %s%n  %s%n ",getavailable_product, getproduct_quantity, getproduct_quantity ,getstore_product_calculations )
print(" Sub Total :",(discount *   product_quantity))
print("Discount   -%2.f : " , sub_total )
print(" VAT +%2.f  : " ,  vat + (discount *  product_quantity) )
print("=============================================================")
print(" Bill Total: ", bill_total)
print("==============================================================")
print("THIS IS NOT AN RECEIPT, KINDLY PAY ",   getstore_product_calculations)
print("===============================================================")



def main():
	getcustomer_name()
	getavailable_product()
	getproduct_quantity(available_product)
	getcashier_name()
	getstore_product_calculations(available_product_price )




 
	
			