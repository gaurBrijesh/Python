password = "brijesh"

for attempt in  range(3):
    chance = 2
    pwd = raw_input("Enter the password: ")
    if(pwd== password):
        print ("Welcome")
        break
    else:
        print ("wrong password, your chance left", chance - attempt)
        continue
print ("try next time")