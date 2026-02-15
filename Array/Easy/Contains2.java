import java.util.HashSet;

class Contains2 {
    public static void main(String args[]) {
      int[] arr = {1,2,3,4,5,67,8,1,2,3};
      int k =3;
      System.out.println(hash(arr,k));
    }

//USING LOOPS
// static boolean loop(int[] arr,int k){
//     for(int i=0;i<arr.length;i++){
//         for(int j=i+1;j<arr.length;j++){
//             if(arr[i]==arr[j] && i-j<= k) return true;
//         }
//     }
//      return false;
// }


//USING HASH SET
    static boolean hash(int[] arr,int k){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
               if(set.contains(arr[i])) return true;
               set.add(arr[i]);
               if(set.size() > k) set.remove(arr[i - k]);
        }
        return false;
    }
}
