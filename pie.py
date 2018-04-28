import random
pie=int(input("total pie"))
n=int(input("no of persons"))
l=[]
a=0
b=0
for i in range(1,n+1):
    l.append(i)
for i in range(pie):
    ch=random.choice(l);
    if ch==1:
        a=a+1
    else:
        b=b+1
print("player A=",a)
print("player B=",b)
