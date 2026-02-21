public class MinPrefix {
    public static void main(String[] args) {
        int[] nums= {-3,2,-3,4,2};
        System.out.println(minStartValue(nums));
    }
     static int minStartValue(int[] nums) {
        int min = 1;
        int[] pf = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {

            if(i == 0) 
                pf[0] = min + nums[0];
            else
                pf[i] = pf[i-1] + nums[i];

            if(pf[i] < 1){
                min = min + 1;
                i = -1;  
            }
        }

        return min;
    }
}
