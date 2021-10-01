#include <iostream>
using namespace std;

void selectionSort(int arr[],int n){
	int temp = 0;
	for(int i = 0; i<=n-1; i++)
	{
		int min = i;
		for(int j=i+1; j<n; j++)
		{
			if(arr[j]<arr[min]){
				min = j;
			}
		}
		if(min!=i){
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
}

int main(){
	int n;
	cout<<"Enter the number elements in the array: ";
	cin>>n;
	int arr[n];
	cout<<"Enter the elements: ";
	for(int i = 0; i<n; i++){
		cin>>arr[i];
	}
	cout<<"Unsorted array: "<<endl;
	for(int i = 0; i<n; i++){
		cout<<arr[i]<<" ";
	}
	cout<<endl;
	
	selectionSort(arr,n);
	
	cout<<"Sorted array: ";
	for(int i = 0; i<n; i++){
		cout<<arr[i]<<" ";
	}
	return 0;
}
