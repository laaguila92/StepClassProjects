'''
Created on Sep 8, 2015

@author: Admin
'''
def main() :
    tempC = float (input("Input the temperature in Celsius: "))#the user inputs the temperature in celsius
    tempF = (tempC * 1.8 + 32)#formula for converting celsius into fahrenheit
    print ("Temperature in Celcius : ", tempC, ", in Fahrenheit is : ", tempF)#prints the temperature in celsius and what it is in fahrenheit
    
main()