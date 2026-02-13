
public class RotatedBs {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        int t = 9;
      System.out.println(BS(arr, t, 0, arr.length - 1));
    }
   

    static int BS(int arr[],int t,int s,int e){
          if (s > e) return -1;
            int m = s + (e - s) / 2;
        if(arr[m] == t) return m;
          if (arr[s] <= arr[m]) {

            if (t >= arr[s] && t < arr[m])
                return BS(arr, t, s, m - 1);
            else
                return BS(arr, t, m + 1, e);
        }

     
        else {

            if (t> arr[m] && t <= arr[e])
                return BS(arr, t, m + 1, e);
            else
                return BS(arr, t, s, m - 1);
        }
    }



}
