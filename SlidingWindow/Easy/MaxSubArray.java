public class MaxSubArray {

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }
    static double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        
        double max = sum;
        
        int l = 0;
        for(int r = k; r < nums.length; r++){
            sum = sum - nums[l] + nums[r];
            l++;
            max = Math.max(max, sum);
        }
        
        return max / k;   
    }
}
