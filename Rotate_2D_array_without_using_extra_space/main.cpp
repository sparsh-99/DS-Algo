#include <iostream>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--){
	    int n;
	    cin>>n;
	    int a[n][n];
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            cin>>a[i][j];
	        }
	    }
	    int b[n][n];
	    for(int r=0;r<n;r++){
	        for(int c=0;c<n;c++){
	            b[c][n-r-1]=a[r][c];
	        }
	    }
	    for(int r=0;r<n;r++){
	        for(int c=0;c<n;c++){
	            cout<<b[r][c]<<" ";
	        }
	    }
	    cout<<endl;
	}
	return 0;
}