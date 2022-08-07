'''Write nested if statements to print the appropriate message depending on the value of
variables temperature and humidity as given as follows. Assume that the temperature can only
be Warm and Cold & humidity can only be Dry or Humid.
Temperature Humidity Print following activity
Warm Dry Play Cricket
Warm Humid Play Basketball
Cold Dry Play Tennis
Cold Humid Play Cricket'''

Temperature = input("Enter Temperature (either Warm or Cold ):").title()
Humidity = input("Enter Humidity (either Humid or Dry) :").title()
''''strings = "Play "
if Temperature == "Warm":
    strings = strings + "Cricket" if Humidity == "Dry" else strings + "Basketball"
else:
    strings = strings + "Tennis" if Humidity == "Dry" else strings + "Cricket"
print(strings)'''
if Temperature == "Warm":
    if Humidity == "Dry":
        print("Play Cricket")
    elif Humidity == "Humid":
        print("Play Basketball")
elif Temperature == "Cold":
    if Humidity == "Dry":
        print("Play Tennis")
    elif Humidity == "Humid":
        print("Play Cricket")

