class NumArray {
    int[] preSum;  

    public NumArray(int[] nums) {
        preSum = new int[nums.length];
        preSum[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            preSum[i] = preSum[i-1] + nums[i]; 
        }
    }
    
    public int sumRange(int left, int right) {
        if(left == 0) return preSum[right];
        return preSum[right] - preSum[left-1];
    }
}

public class RangeQuery {
    public static void main(String[] args) {

        int[] nums = {-2, 0, 3, -5, 2, -1};

        NumArray obj = new NumArray(nums);

        System.out.println(obj.sumRange(0, 2)); // 1
        System.out.println(obj.sumRange(2, 5)); // -1
        System.out.println(obj.sumRange(0, 5)); // -3
    }
}