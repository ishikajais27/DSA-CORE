import java.util.Arrays;

public class ThirdMax {

    public static void main(String[] args) {
        int[] nums = {2,2,4,242,4,};
        System.out.println(thirdMax(nums));
    }
static int thirdMax(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();

        // for (int num : nums) {
        //     set.add(num);   
        // }

        // List<Integer> list = new ArrayList<>(set);
        // Collections.sort(list); 

        // if (list.size() >= 3) {
        //     return list.get(list.size() - 3); 
        // } else {
        //     return list.get(list.size() - 1);
        // }
        Arrays.sort(nums);
        int count = 0;
        int max = nums[nums.length - 1];
        for(int i=nums.length-1;i>0;i--){
            if(max!=nums[i-1]){
                max = nums[i-1];
                count++;
                if(count ==  2) return max;
            }
        }
        return nums[nums.length - 1];
    }    
}
