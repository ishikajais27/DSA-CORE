public class MinRotated {
  
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(findMin(nums));

    }

    //OPTIMAL SOLUTION O(logn) USED CONCEPT OF 2 POINTER 
    static int findMin(int[] nums) {
        int s = 0;
        int e = nums.length - 1;

        while (s < e) {
            int m = s + (e - s) / 2;

            if (nums[m] > nums[e]) {
                s = m + 1;
            } else {
                e = m;
            }
        }
        return nums[s];
    }
}

