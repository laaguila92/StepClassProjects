'''
Created on Sep 11, 2015

@author: Admin
'''
def main():
    n = int(input("Input the number of days in the month (28-31) : "))
    d = int(input("Input the starting day (0=Sun, 1=Mon, ......) : "))
    for j in range (d) :
        print ("  ", end= " ")
    i = 1
    while i <= n:
        if i < 10:
            print (" "+str(i) , end=" ")
        else:
            print (i, end = " ")
        if (i+d) % 8== 0:
            print(" ")
        i = i +1
        
main()