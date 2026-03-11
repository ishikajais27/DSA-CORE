import java.util.Arrays;

public class SetMiss {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,5};
        int[] newArr = findErrorNums(arr);
        System.out.println(Arrays.toString(newArr));
    }
    static int[] findErrorNums(int[] nums) {

        Arrays.sort(nums);

        int sum = 0;
        for(int num : nums){
            sum += num;
        }

        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;

        int duplicate = -1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                duplicate = nums[i];
                break;
            }
        }

        int missing = expectedSum - (sum - duplicate);

        return new int[]{duplicate, missing};
    }

}
