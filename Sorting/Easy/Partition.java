public class Partition {
    public static void main(String[] args) {
        int[] nums = {1,4,3,2};
        System.out.println(arrayPairSum(nums));
    }
     static int arrayPairSum(int[] nums) {
        // Arrays.sort(nums);
        // int sum=0;
        // for(int i=0;i<nums.length;i=i+2){
        //    sum+=nums[i];
        // }
        // return sum;
        int[] count = new int[20001];

        // count frequency
        for (int num : nums) {
            count[num + 10000]++;
        }

        int sum = 0;
        boolean take = true;

        // traverse in sorted order
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {

                if (take) {
                    sum += i - 10000;
                }

                take = !take;
                count[i]--;
            }
        }

        return sum;
    }
}
