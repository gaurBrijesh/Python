num = int(input("Enter the number:"))
expo = int(input("Enter the exponentail number:"))


result = 1
for i in range(1, (expo+1)):
    result = result * num
print ("The result is: ", result)