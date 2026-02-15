
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
  int[] arr = {1, 2, 34, 5, 6, 7, 8};
// System.out.println(loop(arr));
        System.out.println(hash(arr));

    }
  //USING LOOPS - O(n^2)
  static boolean loop(int[] nums){
    for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]) return true;
            }
        }
        return false;
  }

//can be solved using 2 pointers also if the array is sorted - O(nlog(n))

  //USING HASH SET  O(n)
  static boolean hash(int[] arr){
    HashSet<Integer> set = new HashSet<>();
    for(int i=0;i<arr.length;i++){
        if(set.contains(arr[i])){return true;}
        set.add(arr[i]);
    }
    return false;
  }
    
}
