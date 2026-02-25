import java.util.*;

public class Harmonious {

public static void main(String[] args) {
    int[] nums = {1,3,2,2,5,2,3,7};
    System.out.println("Using my approach - "+findLHS(nums));
    System.out.println("Using optimal solution- "+findLhs(nums));
}


  //Optimal solution
  static int findLhs(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int maxLength = 0;

        for(int key : map.keySet()){
            if(map.containsKey(key+1)){
                int length = map.get(key) + map.get(key+1);
                maxLength = Math.max(maxLength,length);
            }

        }
        return maxLength;
        
    }







    //My aproach
    static int findLHS(int[] nums) {
        Arrays.sort(nums);

        int l = 0, r = 0;
        int max = 0;

        while (r < nums.length) {

            int diff = nums[r] - nums[l];

            if (diff == 1) {
                max = Math.max(max, r - l + 1);
                r++;
            } 
            else if (diff < 1) {
                r++;
            } 
            else { 
                l++;
            }
        }

        return max;
    }
}
