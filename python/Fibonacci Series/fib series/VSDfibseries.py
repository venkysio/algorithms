# The function returns the first n fibonacci numbers
# It takes the integer n as parameter
def fib_series(n):
    a=0
    b=1
    print("First",n," fibonacci numbers are: ")
    while n:
        c=a+b
        print(c,end=" ")
        a=b
        b=c
        n-=1

# test drive code:
n=int(input("Enter an integer n: "))
fib_series(n)
