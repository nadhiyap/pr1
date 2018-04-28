m=int(input("enter m"))
n=int(input("enter n"))
i=1
j=0
c=0
while(j<n):
    print(1,end='')
    c=c+1
    while(i<=m and c==2):
        print(0,end='')
        c=0
        i+=1
        break
    j+=1
if i!=m+1:
    print("\nimposssible")
    
