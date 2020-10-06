def cktlsrt(l):#cocktail shaker sort function
    n=len(l)
    s=0
    f=1
    while(f):
        f=0
        for i in range(n-1):
            if l[i]>l[i+1]:
                l[i],l[i+1]=l[i+1],l[i]
                f=1
        if f==0:
            break
        for i in range(n-1,s,-1):
            if l[i]<l[i-1]:
                l[i],l[i-1]=l[i-1],l[i]
                f=1 
l=[5,1,4,-6,-1,-10] #define a list or get by the user inout
cktlsrt(l) 
print (l)
         