fact = 1
num = int(input("Enter the number:"))

#for i in range(1, (num+1)):
 #   fact = fact * i
#print ("The factorial of ", num, " is", fact)


#with while loop

con = 1
while(con <= num):
    fact = fact * con
    con = con +1
print ("The factorial of ", num, " is ", fact)
    