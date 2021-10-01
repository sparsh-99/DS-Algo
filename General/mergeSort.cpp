#include <iostream>
using namespace std;

void merge(int arr[], int lower, int mid, int upper){
	int i, j, k, b[upper];
	i = lower;
	j = mid + 1;
	k = lower;
	while(i<=mid && j<=upper){
		if(arr[i]<=arr[j]){
			b[k] = arr[i];
			i++;
			k++;
		}
		else{
			b[k] = arr[j];
			j++;
			k++;
		}
	}
	
	while(j <= upper){
		b[k] = arr[j];
		j++;
		k++;
	}

	while(i<=mid){
		b[k] = arr[i];
		i++;
		k++;
	}

	for(int p = lower; p<=upper; p++){
		arr[p] = b[p];
	}
	
}

void mergeSort(int arr[], int lower, int upper){
	if(lower<upper){
		int mid = (lower+upper)/2;
		mergeSort(arr, lower, mid);
		mergeSort(arr, mid+1, upper);
		merge(arr, lower, mid, upper);
	}
}

int main(){
	int n;
	cout<<"Enter the number of elements in the array: ";
	cin>>n;
	int lower = 0, upper = n-1;
	int arr[n];
	
	cout<<"Enter the elements: ";
	for(int i = 0; i<n; i++){
		cin>>arr[i];
	}
	cout<<"Unsorted array: ";
	for(int i = 0; i<n; i++){
		cout<<arr[i]<<" ";
	}
	cout<<endl;
	
	mergeSort(arr,lower,upper);
	
	cout<<"Sorted array: ";
	for(int i = 0; i<n; i++){
		cout<<arr[i]<<" ";
	}
	cout<<endl;
	return 0;
}
