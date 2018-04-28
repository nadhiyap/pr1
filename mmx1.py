n=int(input("enter n"))
k=int(input("enter k"))
l=[]
l1=[]
s=""
s1=""
j=0
for i in range(n):
    a=input("enter v")
    if j<k:
        s=s+a+"x"
        j+=1
    else:
        j=0
        s=s+","
        s=s+a+"x"
        j+=1
l=s.split(',')
mi=len(l[0])
s1=str(l[0])
for i in range(len(l)):
    if len(l[i])<mi:
        s1=""
        s1=s1+str(l[i])
l1=s1.split('x')
print(max(l1))
