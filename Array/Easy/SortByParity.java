import java.util.Arrays;

public class SortByParity {
    public static void main(String[] args) {
        int[] nums = {3,1,2,32,4,5,6};
         System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
    static  int[] sortArrayByParity(int[] nums) {
        int l = 0,r=0;
        while(l<nums.length){
            if(nums[l]%2!=0){
                l++;
            }
            else{
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r++;
            }
        }
        return nums;
    }
}
