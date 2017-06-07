import __simplification__
print ('Welcome to simplification program')
print ('Enter 1 for addition and 2 for suntraction')
choice = int(input())
if(choice == 1):
    __simplification__.addition()
elif(choice == 2):
    __simplification__.subtraction()
else:
    print ("Invaild input")
    exit()


