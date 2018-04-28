n=int(input("enter n"))
l=[]
l1=[]
c=0
for j in range(n):
    a=int(input("enter v"))
    l.append(a)
for i in range(0,n):
    j=int(i+1)
    k=int(l[i])
    if j==k:
        pass
    else:
        c=c+1
        l.remove(l[i])
        l.insert(i,i+1)
print(c)
print(l)
