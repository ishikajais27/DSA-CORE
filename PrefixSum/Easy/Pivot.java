public class Pivot {

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
            System.out.println(pivotIndex(nums));
    }
    static  int pivotIndex(int[] nums) {

        int[] pf = new int[nums.length];
        pf[0] = nums[0];

        for(int i = 1; i < nums.length; i++){
            pf[i] = pf[i-1] + nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                if(0 == pf[nums.length-1] - pf[i]) return i;
            }
            else if(pf[i-1] == pf[nums.length-1] - pf[i]){
                return i;
            }
        }

        return -1;
    }
}
