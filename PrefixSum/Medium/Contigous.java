import java.util.HashMap;

public class Contigous {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,1,1,0,0,0};
        System.out.println(findMaxLength(nums));
    }
   static int findMaxLength(int[] nums) {

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) nums[i] = -1;
        }

  
        int[] pf = new int[nums.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        pf[0] = nums[0];

        if(pf[0] == 0) max = 1;
        else map.put(pf[0], 0);

        for(int i = 1; i < nums.length; i++) {
            pf[i] = pf[i-1] + nums[i];

            if(pf[i] == 0) {

                max = Math.max(max, i + 1);
            } else if(map.containsKey(pf[i])) {

                max = Math.max(max, i - map.get(pf[i]));
            } else {
                map.put(pf[i], i);
            }
        }

        return max;
    }
}
