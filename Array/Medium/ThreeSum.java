import java.util.Arrays;

public class ThreeSum {
 
    public static void main(String[] args) {
        int t = 1;
       int[] nums = {-1,2,1,-4};
       System.out.println(threeSumClosest(nums,t));
    }

        static  int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int sum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {

                int currSum = nums[i] + nums[l] + nums[r];

                if (Math.abs(target - currSum) < Math.abs(target - sum)) {
                    sum = currSum;
                }

                if (currSum < target) {
                    l++;
                }
                else if (currSum > target) {
                    r--;
                }
                else {
                    return currSum;
                }
            }
        }

        return sum;
    }
}
