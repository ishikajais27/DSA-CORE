public class MaxSum{
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

//           int curr = 0;
//           int max = nums[0];
//           for(int i=0;i<nums.length;i++){
//             if(curr<0){
//                curr=0;
//             }
//             curr+=nums[i];
//             max=max>curr?max:curr;
//           }
//    System.out.println(max);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                max = Math.max(sum, max);
            }
        }
        System.out.println(max);
        

    }
}