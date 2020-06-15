#include <iostream>
using namespace std;

int sumBitDiff(int a[], int n){
    int sum=0;
    for(int i=0;i<32;i++){
        int count=0;
        for(int j=0;j<n;j++)
            if((a[j]&(1<<i)))
                count++;
        sum+=(count*(n-count)*2);
    }
    return sum;
}


int main() {
	//code
	int t;
	cin>>t;
	while(t--){
	    int n;
	    cin>>n;
	    int a[n];
	    for(int i=0;i<n;i++)
	        cin>>a[i];
	    cout<<sumBitDiff(a,n)<<endl;
	}
	return 0;
}