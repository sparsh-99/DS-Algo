int transitionPoint(int a[], int n) {
    // code here
    int start = 0;
    int end = n-1;
    while(start<=end){
        int mid = start+(end-start)/2;
        if((a[mid]==1 && a[mid-1]==0) || (a[mid-1]==1&&mid==0))
            return mid;
        else if(a[mid]==1)
        {
            end=mid-1;
        }
        else
        {
            start=mid+1;
        }
    }
    return -1;
}