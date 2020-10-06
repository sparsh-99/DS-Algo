#include<iostream>
using namespace std;
void cocktailsort(int [],int );
void swap(int *,int *);
int main(void)
{
    int a[5],n,i;
    n=5;
    cout<<"Enter the 5 elements of the array :\n";   //you can also hardcode it. 
    for(i=0;i<n;++i)
    {
        scanf("%d",&a[i]);
    }
    cocktailsort(a,n);
    cout<<"The sorted array elements are :\n";
    for(i=0;i<n;++i)
    {
        printf("%d\t",a[i]);
    }
    return 0;      
}
void cocktailsort(int a[],int n) // sorting function
{
    int start = 0,end = (n-1),flag = 1;
    while(flag)
    {
        flag = 0;
        for(int i=start;i<end;++i)
        {
            
            if(a[i]>a[i+1])
            {
                swap(&a[i],&a[i+1]);
                flag = 1;
            }
        }
       
        if(flag == 0)
        {
            break;
        }
        for(int i=end;i>start;--i)
        {
            
            if(a[i]<a[i-1])
            {
                swap(&a[i],&a[i-1]);
                flag=1;
            }
        }
    }
}
void swap(int *x,int *y)
{
    int temp;
    temp=*x;
    *x=*y;
    *y=temp;
}
