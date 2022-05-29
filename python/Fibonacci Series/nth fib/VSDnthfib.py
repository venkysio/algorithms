# The function returns the nth fibonacci number
# It takes the integer n as parameter
def nth_fib(n):
    a=0
    b=1
    while n:
        c=a+b
        a=b
        b=c
        n-=1
    return c

# test drive code:
n=int(input("Enter an integer n: "))
print(f"The {n}th fibonacci number is :",nth_fib(n))

    
