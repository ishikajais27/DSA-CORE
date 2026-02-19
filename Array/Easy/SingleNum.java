public class SingleNum {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
          System.out.println(singleNumber(nums));
    }
 static  int singleNumber(int[] nums) {
        //1. USING HASHSET
        //  HashSet<Integer> set = new HashSet<>();
        // for (int num : nums) {
        //     if (set.contains(num)) {
        //         set.remove(num);
        //     } else {
        //         set.add(num);
        //     }
        // }
        // return set.iterator().next();

        //2. USING XOR
        int result = 0;
        for(int num : nums){
              result^=num;
        }
        return result;
    }   
}
