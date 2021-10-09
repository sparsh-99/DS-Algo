// Question link : https://leetcode.com/problems/find-all-duplicates-in-an-array
import java.util.ArrayList;
import java.util.Arrays;
class Rahul_Das_Find_All_Duplicates_In_An_Array {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println("The duplicate elements in the array are :");
        System.out.println(findDuplicates(nums));
    }
    static ArrayList<Integer> findDuplicates(int[] nums) {
        int temp = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i + 1){
                temp = nums[nums[i] - 1];
                if(temp == nums[i]){
                    continue;
                }
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
                i--;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i + 1){
                list.add(nums[i]);
            }
        }
        return list;
    }
}