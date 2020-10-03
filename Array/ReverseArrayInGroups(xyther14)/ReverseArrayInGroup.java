/*Example:
Input
2
5 3
1 2 3 4 5
6 2
10 20 30 40 50 60

Output
3 2 1 5 4
20 10 40 30 60 50

Explanation:
Testcase 1: Reversing groups in size 3, first group consists of elements 1, 2, 3. Reversing this group, we have elements in order as 3, 2, 1.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseArrayInGroup {
    //function to get the reverese of array in groups
    static void reverseArrayInGroup(int[] arr, int k){
        StringBuilder sb = new StringBuilder();
        //stack used to reverse the array elements one by one
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<arr.length;i++){
            if(stack.size()<k) {
                stack.push(arr[i]);
            }
            else{
                while(stack.size()>0) {
                    sb.append(stack.pop()).append(" ");
                }
                stack.push(arr[i]);
            }
        }
        //this part deals with the elements that are left
        if(!stack.isEmpty()){
            while (stack.size()>0)
                sb.append(stack.pop()).append(" ");
        }
        //print the StringBuffer
        System.out.println(sb);
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] integersInString = br.readLine().split(" ");
            int a[] = new int[integersInString.length];
            for (int i = 0; i < integersInString.length; i++) {
                a[i] = Integer.parseInt(integersInString[i]);
            }

            int size = a[0];
            int k = a[1];
            int[] arr = new int[size];
            String[] str = br.readLine().split("\\s+");
            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            reverseArrayInGroup(arr,k);
        }
    }
}
