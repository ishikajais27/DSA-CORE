

public class FirstMiss {
    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};
      System.out.println(firstMissingPositive(arr));
    }
   static int firstMissingPositive(int[] nums) {
        int i = 0;

        while(i < nums.length){
            int corr = nums[i] - 1;

            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[corr]){
                swap(nums, i, corr);
            } 
            else{
                i++;
            }
        }

        for(i = 0; i < nums.length; i++){
            if(nums[i] != i + 1){
                return i + 1;
            }
        }

        return nums.length + 1;
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    } 
}
