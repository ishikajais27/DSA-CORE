
// https://leetcode.com/problems/two-sum/description/

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = {1,2,3,45,7,8};
        int target = 53;
        System.out.println(Arrays.toString(sum(nums,0,1,target)));

        //USING LOOPS
        //   for(int i = 0; i < nums.length; i++) {

        //     for(int j = i + 1; j < nums.length; j++) {

        //         if(nums[i] + nums[j] == target) {
        //             return new int[]{i, j};
        //         }
        //     }
        // }
    }

    static int[] sum(int[] arr, int i, int j, int target) {

        if (i >= arr.length - 1) 
            return new int[]{-1, -1};

        if (j >= arr.length) 
            return sum(arr, i + 1, i + 2, target);

        if (arr[i] + arr[j] == target) 
            return new int[]{i, j};

        return sum(arr, i, j + 1, target);
    }
}