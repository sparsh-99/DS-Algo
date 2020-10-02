/*
Example:
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
Testcase 1: Reversing groups in size 3, first group consists of elements 1, 2, 3. Reversing this group, we have elements in order as 3, 2, 1. */


package Array.ReverseArrayInGroup;

//do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class xyther_ReverseArrayInGroup {
    //function to reverse the array in group
        static void reverseArrayInGroup(int[] arr, int k){
            StringBuffer sb = new StringBuffer();
            //take a stack to push the group count elements one by one
            Stack<Integer> stack = new Stack<>();
            for(int i = 0; i<arr.length;i++){
                if(stack.size()<k) {
                    stack.push(arr[i]);
                }
                else{
                    //if the group count exceeds we append the StringBuffer with popping the Stack
                    while(stack.size()>0) {
                        sb.append(stack.pop()).append(" ");
                    }
                    stack.push(arr[i]);
                }
            }
            //This part is used to append those elements that were left
            if(!stack.isEmpty()){
                while (stack.size()>0)
                    sb.append(stack.pop()).append(" ");
            }
            //Print the elements finally
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
