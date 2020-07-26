#include <iostream>
using namespace std;

void search(int *a, int low, int high){
    if(low>high) return;
    
    if(low==high){
        cout<<a[low]<<endl;
        return;
    }
    int mid = (low+high)/2;

    // If mid is even, compare mid and mid+1, if they are equal, odd appearance is after mid, else not equal, before mid
    if(mid%2==0){
        if(a[mid]==a[mid+1]){
            search(a, mid+2, high);
        }
        else{
            search(a, low, mid);
        }
    }
    // If mid is odd, compare mid and mid-1, if they are equal, odd appearance is after mid, else before mid
    else{
        if(a[mid]==a[mid-1]){
            search(a, mid+1, high);
        }
        else
            search(a, low, mid-1);
    }
}


int main() {
	int t;
	scanf("%d",&t);
	while(t--){
	    int n;
	    scanf("%d",&n);
	    int a[n];
	    for(int i=0;i<n;i++)
	        scanf("%d",&a[i]);
	    search(a, 0, n);
	}
	return 0;
}