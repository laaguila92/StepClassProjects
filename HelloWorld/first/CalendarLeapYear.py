'''
Created on Sep 11, 2015

@author: Admin
'''
def main():
    y = int(input("Select a year to check its leap year status : "))
    check = y%4
    check2 = y%100
    check3 = y%400
    if check != 0 :
        print("Not a Leap Year")
    else:
        if check2 != 0 :
            print("Not a Leap Year")
        else:
            if check3 == 0 :
                print("Leap Year")
            else:
                print("Not a Leap Year")
        
    
main()     