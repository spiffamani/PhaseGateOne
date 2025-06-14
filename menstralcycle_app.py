import datetime
date_interval = 28
length_interval = 14


def getuser_name():
	user_name = input("Enter your name")
	return user_name


def getlast_menstral_cycle(datetime):
	last_mensral_cycle = input.datetime("Enter last menstral cycle date(yyyy-mm-dd)")
	try:
		last_menstral_cycle = datetime.datetime.strptime(last_menstral_cycle , " %y-%m-%d ")
		return last_mensral_cycle
	except ValueError :
		print("Invalid date format. please enter in (yyy-mm-dd) format")
		return getlast_menstral_cycle()

def getnext_menstral_cycle(last_mensral_cycle   , date_interval ): 
	
	return last_mensral_cycle + datetime.timedelta(days = date_interval)
		

def getlength_of_cycle(last_menstral_cycle  , length_interval):
	return last_menstral_cycle - datetime.timedelta(days = length_interval)
	


def main():
	
	user_name = getuser_name()
	last_mensral_cycle  = getlast_menstral_cycle()

	next_menstral_cycle = getnext_menstral_cycle(last_menstral_cycle , date_interval)

	length_of_cycle = getlength_of_cycle(last_menstral_cycle , length_interval)


	print(f"\n {user_name} , Here is your menstral cycle details " )
	print(f" your last menstral cycle {last_menstral_cycle ("%y-%m-%d")}")
	print(f" your next menstral cycle is on {next_menstral_cycle (" %y-%m-%d ")}")
	print(f" your length of cycle is {length_of_cycle (" %y-%m-%d ")}")








