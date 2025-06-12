import datetime
date_interval = 28
length_interval = 14


def getuser_name():
	user_name = input("Enter your name")
	return user_name


def getlast_menstral_cycle(datetime):
	last_mensral_cycle = input.datetime("Enter last menstral cycle date(yyyy-mm-dd)")
	return last_mensral_cycle

def getnext_menstral_cycle(datetime   , date_interval ): 

	return datetime.plusDays(date_interval)	


def length_of_cycle(datetime  , length_interval):
	return datetime.minusDays(length_interval)


def main():
	
	getuser_name(user_name)

	print("Your Last Menstral Cycle")
	getlast_menstral_cycle(last_mensral_cycle)

	print("Your Next Menstral Cycle")
	getnext_menstral_cycle(date_interval)

	print("Your  Menstral Cycle Length ")
	length_of_cycle(length_interval)


