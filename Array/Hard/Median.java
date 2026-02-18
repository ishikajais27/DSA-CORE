public class Median {
   public static void main(String[] args) {
       int[] a1 = {1,2,3,4,5};
       int[] a2 = {0,4,6,8,9};
       double m = findMedianSortedArrays(a1,a2);
       System.out.println(m); 
   }   

   //USING 2 POINTER
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        
        int[] merge = new int[m + n];
        int i = 0, s1 = 0, s2 = 0;
        
        while (s1 < m && s2 < n) {
            if (nums1[s1] < nums2[s2]) {
                merge[i++] = nums1[s1++];
            } else {
                merge[i++] = nums2[s2++];
            }
        }
        
        while (s1 < m) {
            merge[i++] = nums1[s1++];
        }
        
        while (s2 < n) {
            merge[i++] = nums2[s2++];
        }
        
        int total = m + n;
        
        if (total % 2 == 1) {
            return merge[total / 2];
        } else {
            return (merge[total / 2 - 1] + merge[total / 2]) / 2.0;
        }
    } 
}
