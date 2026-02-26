import java.util.*;
public class MinDiff {
    public static void main(String[] args) {
        int[] nums = {9,4,1,7};
        int k = 3;
        System.out.println(minimumDifference(nums, k));
    }
    static int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0,r = k-1;
        int diff,minDiff = Integer.MAX_VALUE;
        if(k == 0 || nums.length==1) {
            return 0;
        }
        else{
        while(r<nums.length){
            diff = nums[r] - nums[l];
             minDiff = Math.min(minDiff,diff);
             r++;
             l++;
        }
        }

        return minDiff;
    }
}