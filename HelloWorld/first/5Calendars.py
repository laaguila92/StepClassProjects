'''
Created on Sep 11, 2015

@author: Admin
'''
def main():
    for x in range (5):
        n = int(input("Input the number of days in the month (28-31) : "))
        while n>31 or n<28:
            print("Please enter a number between 28 and 31")
            n = int(input("Input the number of days in the month (28-31) : "))
        else:
            d = int(input("Input the starting day (0=Sun, 1=Mon, ......) : "))
        for j in range (d) :
            print ("  ", end= " ")
            i = 1
        while i <= n:
            if i < 10:
                print (" "+str(i) , end=" ")
            else:
                print (i, end = " ")
            if (i+d) % 7== 0:
                print(" ")
            i = i +1
        print("\n")
main()

