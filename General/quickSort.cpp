#include <iostream>
using namespace std;

int partition(int arr[], int s, int e, int n){
	int pivot, pindex;
	pivot = arr[e];
	pindex = s;
	for(int i = s; i<=e-1; i++){
		if(arr[i]<=pivot){
			int temp = arr[i];
			arr[i] = arr[pindex];
			arr[pindex] = temp;
			pindex++;
		}
	}
	
	int temp1 = arr[e];
	arr[e] = arr[pindex];
	arr[pindex] = temp1;
	
	return pindex;
}

void quickSort(int arr[], int s, int e, int n){
	if(s<e){
		int p = partition (arr, s, e, n);
		quickSort(arr, s, p-1, n);
		quickSort(arr, p+1, e, n);	
	}
}


int main(){
	int n;
	cout<<"Enter the number of elements in the array: ";
	cin>>n;
	int arr[n];
	int s = 0, e = n-1;
	cout<<"Enter the elements: ";
	for(int i = 0; i<n; i++){
		cin>>arr[i];
	}
	cout<<"Unsorted array: ";
	for(int i = 0; i<n; i++){
		cout<<arr[i]<<" ";
	}
	cout<<endl;
	
	quickSort(arr, s, e, n);
	
	cout<<"Sorted array: ";
	for(int i = 0; i<n; i++){
		cout<<arr[i]<<" ";
	}
	return 0;
}
