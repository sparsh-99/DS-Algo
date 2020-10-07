import java.util.*;

public class Anjali_slidingwindowmax {

    public static int windowMax(int[] arr, int m){

        Queue<Integer> q = new LinkedList<Integer>();
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int pos = 0;

        /*Add array elements to make the initial queue of size 1 less than window size required and get its sum*/
        for(int i=0; i<m-1; i++)
        {
            q.add(arr[i]);
            sum = sum + arr[i];
        }

        /*Now from m-1 position iterate till last of the array */
        for(int i=m-1; i<arr.length; i++)
        {
            /*Add ith element at rear end of the queue and add that in sum to get sum of window*/
            q.add(arr[i]);
            sum = sum + arr[i];

            /*if sum is greater than or equal to max then max will be equal to sum and store pos of first element of the window */
            if(sum >= max)
            {
                max = sum;
                pos = i-m+1;
            }

            /*Now remove element from front of queue and decrease that value from the sum */
            q.remove();
            sum = sum - arr[i-m+1];
                
        }

        /*Return position of first element of window maximum */
        return pos;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the window");
        int k = sc.nextInt();

        int pos = windowMax(a, k);

        System.out.println("Window with maximum sum is :");
        for(int i=pos; i<(pos+k); i++)
        {
            System.out.print(a[i] + " ");
        }

        sc.close();

    }

    
}
