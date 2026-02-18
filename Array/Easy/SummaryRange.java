import java.util.ArrayList;
import java.util.List;

public class SummaryRange {
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        System.out.println(summaryRanges(nums));
        
    }

     static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int start = nums[i];
            while(i + 1 < nums.length && nums[i + 1] - nums[i] == 1){
                i++;
            }
            if(start != nums[i]){
                result.add(Integer.toString(start) + "->" + Integer.toString(nums[i]));
            }
            else{
                result.add(Integer.toString(start));
            }
        }
        return result;
    }
}
