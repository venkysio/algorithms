
import threading 
import timeit

def multi(strings):
    for i in strings:
        reverse(i)
        
def reverse(string):
    i=0
    j=len(string)-1
    string = list(string)
    while(i<j):
        string[i],string[j]=string[j],string[i]
        i+=1
        j-=1
    ans="".join(string)
    print(ans,end=" ")

para="Lorem ipsum dolor, sit amet consectetur adipisicing elit. Ea neque numquam est vitae. Praesentium alias pariatur non sequi veniam facere esse ea placeat corporis neque ad consectetur distinctio quae expedita deleniti ex dolore id amet, a animi eaque voluptate. Quisquam, maxime deserunt neque sed earum quasi ullam perspiciatis quis voluptates ratione incidunt aspernatur ipsa natus reiciendis unde culpa, odit fuga quaerat? Doloribus perspiciatis provident excepturi cupiditate consequatur laboriosam odit iure quis atque vitae saepe non quaerat earum minus unde quam eaque aliquam modi, aut, quia expedita autem deleniti velit odio. Cupiditate ipsa eos odio quod repellat reprehenderit quas libero veritatis."

start=timeit.default_timer()
for i in para.split():
    reverse(i)
end=timeit.default_timer()
print()
print(end-start,"milliseconds")


para=para.split()
n=len(para)

a=para[:n//4]
b=para[(n//4)+1:n//2]
c=para[1+(n//2):(3*n)//4]
d=para[(3*n)+1:]

t1=threading.Thread(target=multi,args=(a,))
t2=threading.Thread(target=multi,args=(b,))
t3=threading.Thread(target=multi,args=(c,))
t4=threading.Thread(target=multi,args=(d,))
start=timeit.default_timer()
t1.start()
t2.start()
t3.start()
t4.start()
end=timeit.default_timer()
t1.join()
t2.join()
t3.join()
t4.join()
print()
print(end-start,"milliseconds")
