import java.util.Collections;
import java.util.HashMap;

public class MaxConsecutive {
 
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutive(nums));
    }
    //Aproach 1
    static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                max=Math.max(max,count);
            }
            else{
                max=Math.max(max,count);
                count=0;
            }
        }
        return max;
    }


    //Aproach 2 using hash map
     static int findMaxConsecutive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0,j=1;
         for(int num : nums){
            if(num!=0){
              count+=1;
              map.put(j,count);
            }
            else{
                count =0;
                j+=1;
            }
         }
        if (map.isEmpty()) return 0;
return Collections.max(map.values());
    }
}
