public class MaxProduct{
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println(maxProduct(nums));
    }


    //Optimal solution O(n) and for brute force it's O(n^2)
   static int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;

        int min = nums[0];
        int max = nums[0];
        int result = max;

        for (int i = 1; i < nums.length; i++) {
            int tempMax = Math.max(Math.max(min * nums[i], max * nums[i]), nums[i]);
            min = Math.min(Math.min(min * nums[i], max * nums[i]), nums[i]);
            max = tempMax;
            result = Math.max(max, result);
        }
        return result;
    }
}