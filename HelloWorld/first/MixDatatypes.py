'''
Created on Sep 10, 2015

@author: Admin
'''
def mixdata():
    a= str(input("What is your favorite season?"))#asks the user for input in the form of a string and assigns it to the variable "a"
    b= str(input("What is your favorite month?"))#asks the user for input in the form of a string and assigns it to the variable "b"
    c= str(input("What is your favorite word?"))#asks the user for input in the form of a string and assigns it to the variable "c"
    d= int(input("What is your favorite number?"))#asks the user for input in the form of an integer and assigns it to the variable "d"
    e= int(input("What day of the month does your birthday fall on?"))#asks the user for input in the form of an integer and assigns it to the variable "e"
    f= int(input("What is 2+2?"))#asks the user for input in the form of an integer and assigns it to the variable "f"
    userlist= [a, b, c, d, e, f]#creates a list composed of the user's input, combining the ints and the strings in one list
    print(userlist)# prints out the list "userlist"
    print(d+e+f)#adds the user inputed integers together and prints it
    stringlist= [a, b, c]#creates a  list of only the user inputed strings
    print(stringlist)#prints the list "stringlist"
   
   
    
mixdata()
   
   
    
    
    