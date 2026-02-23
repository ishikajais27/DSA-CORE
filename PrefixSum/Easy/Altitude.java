public class Altitude {
    public static void main(String[] args) {
        int[] nums = {-5,1,5,0,-7};
        System.out.println(largestAltitude(nums));
    }
    static  int largestAltitude(int[] gain) {
        // int[] arr = new int[gain.length+1];
        // for(int i=0;i<arr.length;i++){
        //     if(i==0)  arr[0] = 0;
        //     else arr[i] = gain[i-1] +arr[i-1];
        // }
        // Arrays.sort(arr);
        // if(arr[arr.length-1]<0) return 0;
        // else return arr[arr.length-1];
         //OPTIMAL WAY
        int max = 0;
        int current = 0;

        for (int i = 0; i < gain.length; i++) {
            current += gain[i];
            if (current > max) {
                max = current;
            }
        }

        return max;
       
        
    }
}
