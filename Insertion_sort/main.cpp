/* The task is to complete insert() which is used 
   as shown below to implement insertionSort() */

/* Function to sort an array using insertion sort
void insertionSort(int arr[], int n)
{
   int i;
   for (i = 1; i < n; i++)
      insert(arr, i);
} */

void insert(int a[], int i)
{
      int key = a[i], j=i-1;
      while(j>=0 && a[j]>key){
          a[j+1] = a[j];
          j--;
      }
      a[j+1] = key;
}