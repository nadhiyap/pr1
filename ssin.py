s=input("enter the string1")
l=[]
s1=input("enter the string2")
s3=""
s4=""
c=1
for i in range(len(s1)):
    if c==2:
        s3=s3+s1[i-1]+s1[i]+","
        if i==len(s1)-1:
            break
        s3=s3+s1[i]+s1[i+1]+","
        c=0
        c=c+1
    else:
        c=c+1
l1=s3.split(',')
l1.remove('')
b=0
for i in range(len(l1)):
    if l1[i] in s:
        print(l1[i],' ',s)
        b=1
if b==1:
    print("yes")
else:
    print("no")
