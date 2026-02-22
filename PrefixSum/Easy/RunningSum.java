public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        System.out.println(runningSum(nums));
    }
   static int[] runningSum(int[] nums) {
        int[] pf = new int[nums.length];
        pf[0] = nums[0];
        for(int i = 1;i<nums.length;i++){
             pf[i] = pf[i-1]+nums[i];
        }
        return pf;
    }
}
