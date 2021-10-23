ers

4

Here is an O(n^3) solution

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
public class Solution {
public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
    // Start typing your Java solution below
    // DO NOT write main() function

    Arrays.sort(num);
    HashSet<ArrayList<Integer>> hSet = new HashSet<ArrayList<Integer>>();
    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    for (int i = 0; i < num.length; i++) {
        for (int j = i + 1; j < num.length; j++) {
            for (int k = j + 1, l = num.length - 1; k < l;) {
                int sum = num[i] + num[j] + num[k] + num[l];
                if (sum > target) {
                    l--;
                }
                else if (sum < target) {
                    k++;
                }
                else if (sum == target) {
                    ArrayList<Integer> found = new ArrayList<Integer>();
                    found.add(num[i]);
                    found.add(num[j]);
                    found.add(num[k]);
                    found.add(num[l]);
                    if (!hSet.contains(found)) {
                        hSet.add(found);
                        result.add(found);
                    }

                    k++;
                    l--;

                }
            }
        }
    }
    return result;
}
