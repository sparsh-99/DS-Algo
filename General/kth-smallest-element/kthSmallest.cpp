#include <iostream>
#include <algorithm>
using namespace std;

int main() {
	int t;
	scanf("%d",&t);
	while(t--){
	    int n;
	    scanf("%d",&n);
	    int a[n];
	    for(int i=0;i<n;i++)
	        scanf("%d",&a[i]);
	   int k;
	   scanf("%d",&k);
	   sort(a,a+n);
	   cout<<a[k-1]<<endl;
	}
	return 0;
}
