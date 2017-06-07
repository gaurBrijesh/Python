print ('Enter the name:')
name = raw_input()
print ('Enter the age:')
age = int(input())
if age > 0:
    print ('Welcome', name,  'you are ', age, 'old.')

elif age < 0:
    print ('Invalid input')
    exit()