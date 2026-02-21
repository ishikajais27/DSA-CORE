public class MiddleIndex {
    public static void main(String[] args) {
        int[] nums = {2,3,-1,8,4};
        System.out.println(findMiddleIndex(nums));
    }
    static  int findMiddleIndex(int[] nums) {
        int[] pf = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(i == 0) pf[0] = nums[0];
            else pf[i] = pf[i-1] + nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            int left = (i == 0) ? 0 : pf[i-1];
            int right = pf[nums.length - 1] - pf[i];
            if(left == right){
                return i;
            }
        }
        return -1;
    }
}
