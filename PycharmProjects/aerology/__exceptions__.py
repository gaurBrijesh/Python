
num1 = int(input("Enter the first number"))
num2 = int(input("Enter the second number"))

try:
    result = num1/num2
except:
    print ("You can't divide number by zero")

else:
    print ("The result of %d and %d is %d"%(num1,num2,result))