import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Intersection {
   public static void main(String[] args) {
       int[]  nums1 = {1,2,2,1};
       int[] nums2 = {2,2};
       int[] result = (intersect(nums1, nums2));
              System.out.println(Arrays.toString(result));
   }

   static  int[] intersect(int[] nums1, int[] nums2) {
        // APROACH 1 USING SORTING AND 2 PTR
        //  Arrays.sort(nums1);
        //  Arrays.sort(nums2);
        //  int i = 0,j=0,t=0;
        //   int[] arr = new int[Math.min(nums1.length, nums2.length)];
       
        // while (i < nums1.length && j < nums2.length) {
        //     if (nums1[i] == nums2[j]){ arr[t++] = nums1[i]; i++; j++;}
        //     else if (nums1[i] < nums2[j]) i++;
        //     else j++;
        // }
                //   return Arrays.copyOf(arr, t);
        //APROACH2 USING HASH MAP
         Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums1) count.put(num, count.getOrDefault(num, 0) + 1);

        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;

        for (int num : nums2) {
            if (count.getOrDefault(num, 0) > 0) {
                temp[k++] = num;
                count.put(num, count.get(num) - 1);
            }
        }

        return Arrays.copyOf(temp, k);
       
    }
}
