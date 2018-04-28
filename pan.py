s=input("enter the string")
l=[]
s1=""
s5=set()
for i in range(97,123):
    s1=s1+chr(i)+" "
print(s,s1)
s3=set(s)
s4=set(s1)
s5=s3^s4
print(s5)
if len(s5)==0:
    print("yes")
else:
    print("no")
