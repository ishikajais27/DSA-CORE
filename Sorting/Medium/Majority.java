public class Majority {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        int target = 2;
        System.out.println(countMajoritySubarrays(nums, target));
    }
      static int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int ans = 0;

        for (int start = 0; start < n; start++) {
            int targetCount = 0;    
            int length = 0;

            int right = start;
            while (right < n) {
                length++;
                if (nums[right] == target) {
                    targetCount++;
                }

                if (targetCount > length / 2) {
                    ans++;
                }
                right++;
            }
        }

        return ans;
    }    
}
