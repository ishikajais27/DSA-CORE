public class OddSum {
        public static void main(String[] args) {
            int[] nums = {1,2,3,4,5,6};
            System.out.println(sumOddLengthSubarrays(nums));
        }
   static int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        
        int[] pf = new int[n];
        pf[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pf[i] = arr[i] + pf[i - 1];
        }

        int sum = 0;

        for (int len = 1; len <= n; len += 2) {   
            for (int start = 0; start + len - 1 < n; start++) {
                int end = start + len - 1;

                if (start == 0)
                    sum += pf[end];
                else
                    sum += pf[end] - pf[start - 1];
            }
        }

        return sum;
    }
}

