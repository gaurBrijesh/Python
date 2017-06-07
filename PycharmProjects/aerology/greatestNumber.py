num1 = int(input())
num2 = int(input())
num3 = int(input())

if((num1 > num2) & (num1 > num3)):
    print (num1,'is a greatest number')

elif((num2 > num1) & (num2 > num3)):
    print (num2, 'is a greatest number')

else:
    print (num3, 'is a greatest number')