s=input("enter the string")
s1=s[::-1]
c=0
s2=""
if s1==s:
    print("yes")
else:
    for i in range(len(s1)):
        if s1[i]=='0':
            c=c+1
        else:
            break
    for i in range(c):
        s1=s1+"0"
    print(s1)
    s2=s1[::-1]
    if s1==s2:
        print("yes")
    else:
        print("no")
    
    
